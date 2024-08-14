package ru.otus.java.basic.two.HW7;

public class Car implements Travel {
    private int fuel;

    public Car(int fuel, int distance) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean moving(int distance, Terrain territory) {
        if (territory == Terrain.DEEPFOREST | territory == Terrain.SWAMP) {
            System.out.println("Проехать нельзя");
            return false;
        }
        if (fuel < distance) {
            System.out.println("Можно проехать");
            System.out.println("Топлива на дистанцию нет");
            return false;
        } else {
            System.out.println("Можно проехать");
            System.out.println("Топлива на дистанцию хватило");
        }
        return true;
    }
}
