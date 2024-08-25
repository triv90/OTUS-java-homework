package ru.otus.java.basic.three.hw21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main21 {
    private static final Object mon = new Object();
    private static String curretLetter = "A";

    public static void main(String[] args) {
        ExecutorService serv = Executors.newFixedThreadPool(3);
        serv.execute(() -> {
            printA();
        });
        serv.execute(() -> {
            printB();
        });
        serv.execute(() -> {
            printC();
        });
        serv.shutdown();
    }

    public static void printA(){
        synchronized (mon) {
            try {
                for (int i =0; i < 5; i++){
                    while (!curretLetter.equals("A")){
                        mon.wait();
                    }
                    System.out.print(curretLetter);
                    curretLetter = "B";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printB(){
        synchronized (mon) {
            try {
                for (int i =0; i < 5; i++){
                    while (!curretLetter.equals("B")){
                        mon.wait();
                    }
                    System.out.print(curretLetter);
                    curretLetter = "C";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printC(){
        synchronized (mon) {
            try {
                for (int i =0; i < 5; i++){
                    while (!curretLetter.equals("C")){
                        mon.wait();
                    }
                    System.out.print(curretLetter);
                    curretLetter = "A";
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
