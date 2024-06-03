package ru.otus.java.basic;

public class Main {
    public static void main(String[] args) {

        int ran = (int) (Math.random() * 10)+1;
        String string = "String";
        int[] arr = new int[ran];
        fillRandomArr(arr);
        System.out.println("\nran = " + ran);

        System.out.println("\n1");
        printString(ran, string);
        System.out.println("\n2");
        sumArrMoreFive(arr);
        System.out.println("\n3");
        fillArr(ran, arr);
        System.out.println("\n4");
        fillRandomArr(arr);
        System.out.println("");
        addArr(ran, arr);
        System.out.println("\n5");
        int dataLeft = 0;
        int dataRight = 0;
        System.out.print("arr = ");
        for (int i = 0; i < (arr.length / 2); i++) {
            dataLeft += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.print("| ");
        for (int i = arr.length / 2; i < arr.length; i++) {
            dataRight += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        if (dataRight < dataLeft) {
            System.out.println("Левая часть больше");
        } else if (dataRight > dataLeft) {
            System.out.println("Правая часть больше");
        } else {
            System.out.println("Части равны");
        }
    }

    private static void fillRandomArr(int[] arr) {
        System.out.print("arr = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
            System.out.print(arr[i] + " ");
        }
    }

    private static void addArr(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += x;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static void fillArr(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static void sumArrMoreFive(int[] arr) {
        int dataSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                dataSum += arr[i];
            }
        }
        System.out.println(dataSum);
    }

    private static void printString(int count, String string) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }


}