package ru.otus.java.basic;

public class Main {
    public static void main(String[] args) {
        
        int size = 3;
        int n = 5;
        int squareMass [][] = new int [n][n];
        int massRend [][] = new int [2][3];

        initialMass(massRend);
        initialMass(squareMass);
        printMass(massRend);
        System.out.println();
        printMass(squareMass);

        System.out.println(sumOfPositiveElements(massRend));
        System.out.println();
        printSquare(size);
        delDiagSquare(squareMass);
        System.out.println();
        printMass(squareMass);
        System.out.println();
        System.out.println(findMax(massRend));
        System.out.println();
        printMass(massRend);
        System.out.println();
        System.out.println(sumTwoStrOrCol(massRend, "string"));
        System.out.println(sumTwoStrOrCol(massRend, "column"));

    }

    private static void printMass(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initialMass(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = (int)((Math.random()*10)-(Math.random()*10));
            }
        }
    }

    private static int sumTwoStrOrCol(int[][] mass, String s) {
        int sum = 0; 
        if((s == "string") && (mass.length >= 2)){
            for (int i = 0; i < mass[1].length; i++) {
            sum += mass[1][i];
            }
            return sum;
        } else if ((s == "column") && (mass[0].length >= 2)) {
            for (int i = 0; i < mass.length; i++) {
                if(mass[i].length >= 2) {
                    sum += mass[i][1];
                }
            }
            return sum;
        }
        else{
            return -1;
        }
    }

    private static int findMax(int[][] mass) {
        int max = mass[0][0];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (max < mass[i][j]){
                    max = mass[i][j];
                }
            }
        }
        return max;
    }

    private static void delDiagSquare(int[][] squareMass) {
        for (int i = 0; i < squareMass.length; i++) {
            squareMass[i][i] = 0;
            squareMass[i][squareMass.length - i - 1] = 0;

        }
    }

    private static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int sumOfPositiveElements(int[][] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] > 0) {
                    sum += mass[i][j];
                }
            }
        }
        return sum;
    }
}