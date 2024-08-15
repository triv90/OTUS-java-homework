package ru.otus.java.basic.two.hm6;

public class Main6 {
    public static void main(String[] args) {
        Plate red = new Plate(100, 100);
        Cat[] cats = {
                new Cat("Мурка", 10, false),
                new Cat("Муська", 10, false),
                new Cat("Кыска", 8, false),
                new Cat("Барсик", 6, false),
                new Cat("Кот", 15, false),
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(red);
        }
    }
}
