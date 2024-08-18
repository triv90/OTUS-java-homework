package ru.otus.java.basic.three.hw19;

public class AppleBox extends Box<Apple> {

    public AppleBox() {
        super();
    }

    @Override
    int weight() {
        return getContents().size();
    }
}
