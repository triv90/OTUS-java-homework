package ru.otus.java.basic.three.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main11 {
    public static void main(String[] args) {
        List<Child> childList = new ArrayList<>(Arrays.asList(
                new Child("Ребенок 1", 9),
                new Child("Ребенок 2", 8),
                new Child("Ребенок 3", 7),
                new Child("Ребенок 4", 6),
                new Child("Ребенок 5", 5),
                new Child("Ребенок 6", 3),
                new Child("Ребенок 7", 4),
                new Child("Ребенок 8", 1),
                new Child("Ребенок 9", 2)
        ));

        Tree<Child> tree = new Tree<>();

        for (Child value : childList) {
            tree.insert(value);
        }

        Child child = new Child("Ребенок 5", 5);
        System.out.println("Поиск ребенка: " + child);
        System.out.println("Результат: " + tree.find(child));

        child = new Child("Ребенок 9", 9);
        System.out.println("Поиск ребенка: " + child);
        System.out.println("Результат: " + tree.find(child));

        List<Child> sortedChildList = tree.getSortedList();
        System.out.println("Отсортированный список детей:");
        for (Child value : sortedChildList) {
            System.out.println(value);
        }
    }
}
