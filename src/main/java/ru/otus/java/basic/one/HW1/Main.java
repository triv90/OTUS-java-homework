package ru.otus.java.basic.one.HW1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания (1-5):");
        int choice = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        if (choice == 1) {
            greetings();
        } else if (choice == 2) {
            System.out.println("Введите целое число a");
            a = scanner.nextInt();
            System.out.println("Введите целое число b");
            b = scanner.nextInt();
            System.out.println("Введите целое число c");
            c = scanner.nextInt();
            chekSing(a, b, c);
        } else if (choice == 3) {
            selectColor();
        } else if (choice == 4) {
            compareNumbers();
        } else if (choice == 5) {
            System.out.println("Введите целое число a");
            a = scanner.nextInt();
            System.out.println("Введите целое число b");
            b = scanner.nextInt();
            if (Math.random() > 0.5) {
                addOrSubtractAndPrint(a, b, true);
            } else {
                addOrSubtractAndPrint(a, b, false);
            }
            @sproshchaev sproshchaev on Jun 5
            Весь if -else:

            if (Math.random() > 0.5) {
                addOrSubtractAndPrint(a, b, true);
            } else {
                addOrSubtractAndPrint(a, b, false);
            }
            можно заменить на одну строку:

            addOrSubtractAndPrint(a, b, Math.random() > 0.5);
        }

    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println("Выражение: " + initValue + " + " + delta + " = " + (initValue + delta));
        } else {
            System.out.println("Выражение: " + initValue + " - " + delta + " = " + (initValue - delta));
        }
    }

    private static void compareNumbers() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        System.out.println("Число а:" + a);
        System.out.println("Число b:" + b);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void selectColor() {
        int data = (int) (Math.random() * 30);
        System.out.println("Случайное число:" + data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void chekSing(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }
}
