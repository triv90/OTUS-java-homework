package ru.otus.java.basic.three.hw19;

public class OrangeBox extends Box<Orange> {

    public OrangeBox() {
        super();
    }

    @Override
    int weight() {
        return getContents().size();
    }
}
