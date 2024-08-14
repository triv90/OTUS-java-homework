package ru.otus.java.basic.two.HW5;

public class Cat extends Animal{
    public Cat(String name, int velocityRun, int endurance) {
        super(name, velocityRun, 0, endurance, 0);
    }

    @Override
    public float swim(int distance) {
        System.out.println("Коты не плавают!");
        return 0;
    }
}
