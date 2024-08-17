package ru.otus.java.basic.three.hw14;

public class Calculation {
    private int numberOfElements;

    public Calculation(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public static double[] fillMassive(int numberOfElements) {
        double[] array = new double[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return array;
    }
}
