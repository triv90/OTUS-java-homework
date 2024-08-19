package ru.otus.java.basic.two.hm7;

public class Bicycle implements Travel {


    public Bicycle(int distance) {
    }

    @Override
    public boolean moving(int distance, Terrain territory) {
        if (territory == Terrain.SWAMP) {
            System.out.println("Болото. Проехать нельзя");
            return false;
        }
        System.out.println("Можно проехать");
        return true;
    }
}
