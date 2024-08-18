package ru.otus.java.basic.three.hw19;

public class FruitBox extends Box<Fruit> {

    public FruitBox() {
        super();
    }

    @Override
    int weight() {
        return getContents().size();
    }
}
