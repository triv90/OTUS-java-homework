package ru.otus.java.basic.two.HW6;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (!plate.decreaseFood(appetite)) {
            System.out.println("Коту " + name + " не хватило еды и он голоден");
        } else {
            this.satiety = true;
            System.out.println("Кот " + name + " сыт и доволен");
        }
    }
}
