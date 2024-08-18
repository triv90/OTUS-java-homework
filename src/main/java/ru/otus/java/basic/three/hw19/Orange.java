package ru.otus.java.basic.three.hw19;

public class Orange extends Fruit {
    private final int weight;

    public Orange() {
        this.weight = 1;
    }
    @Override
    int getWeight() {
        return weight;
    }
}
