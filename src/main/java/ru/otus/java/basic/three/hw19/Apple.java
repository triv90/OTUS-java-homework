package ru.otus.java.basic.three.hw19;

public class Apple extends Fruit {
    private final int weight;

    public Apple() {
        this.weight = 1;
    }
    @Override
    int getWeight() {
        return weight;
    }
}
