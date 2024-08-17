package ru.otus.java.basic.three.hw14;

public class Main14 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        //Calculation.fillMassive(100_000_000);
        Calculation2.fillMassive2(100_000_000);
        System.out.println("Задача выполнена за " + (System.currentTimeMillis() - time) + " миллисекунд");
    }
}
