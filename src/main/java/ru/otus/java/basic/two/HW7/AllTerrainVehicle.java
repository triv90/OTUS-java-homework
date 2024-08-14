package ru.otus.java.basic.two.HW7;

public class AllTerrainVehicle implements Travel {
    private int fuel;

    public AllTerrainVehicle(int fuel, int distance) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean moving(int distance, Terrain territory) {
        if (fuel < distance) {
            System.out.println("Топлива на дистанцию нет");
            return false;
        }
        System.out.println("Топлива на дистанцию хватило");
        System.out.println("Везде проехал");
        return true;
    }
}

