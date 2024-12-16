package ru.otus.java.basic.two.hm5;

public class Main5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", 2, 100);
        cat.info();
        cat.run(20);
        cat.swim(20);
        cat.info();
        System.out.println();

        Dog dog = new Dog("Пес", 5, 2, 201);
        dog.info();
        dog.run(100);
        dog.swim(50);
        dog.info();
        System.out.println();

        Horse horse = new Horse("Конь", 40, 5, 500);
        horse.info();
        horse.run(200);
        horse.swim(50);
        horse.info();
        System.out.println();
    }
}
