package ru.otus.java.basic.three.hw14;

public class Calculation2 {
    private int numberOfElements;

    public Calculation2(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public static double[] fillMassive2(int numberOfElements) {
        double[] array = new double[numberOfElements];
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < numberOfElements / 4; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
//                    array[i] = 0.0;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = numberOfElements / 4; i < numberOfElements / 2; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = numberOfElements / 2; i < numberOfElements * 3 / 4; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
//                    array[i] = 0.0;
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = numberOfElements * 3 / 4; i < numberOfElements; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        return array;
    }
}
