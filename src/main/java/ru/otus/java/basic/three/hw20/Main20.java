package ru.otus.java.basic.three.hw20;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        System.out.println("Working Directory = C:\\Users\\Иван Трофимов\\IdeaProjects\\otus-java-basic-homework\\src\\main" +
                "\\java\\ru\\otus\\java\\basic\\three\\hw20\\files\\");

        String fileName, substring;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя файла: ");
            fileName ="C:\\Users\\Иван Трофимов\\IdeaProjects\\otus-java-basic-homework\\src\\main\\java\\ru\\otus\\java\\basic\\three\\hw20\\files\\" + scanner.nextLine();

            System.out.print("Введите искомую последовательность символов: ");
            substring = scanner.nextLine();
        }

        int count = countSubstringOccurrences(fileName, substring);

        System.out.println("Количество вхождений: " + count);
    }

    private static int countSubstringOccurrences(String fileName, String substring) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int index = 0;
                while ((index = line.indexOf(substring, index)) != -1) {
                    count++;
                    index += substring.length();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}
