package ru.otus.java.basic.two.hm7;

public class Horse implements Travel {
    private int force;

    public Horse(int force, int distance) {
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    @Override
    public boolean moving(int distance, Terrain territory) {
        if (territory == Terrain.SWAMP) {
            System.out.println("Проехать нельзя");
            return false;
        }
        if (force < distance) {
            System.out.println("Можно проехать");
            System.out.println("Сил на дистанцию нет");
            return false;
        } else {
            System.out.println("Можно проехать");
            System.out.println("Сил на дистанцию хватило");
        }
        return true;
    }
}
