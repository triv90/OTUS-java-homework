package ru.otus.java.basic.three.hm13.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws RuntimeException, IOException {
        try (Socket socket = new Socket("localhost", 8088)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String str = in.readLine().trim();
            System.out.println(str);

            String str1 = in.readLine().trim();
            System.out.println(str1);
            Scanner scanner1 = new Scanner(System.in);
            Float string1 = scanner1.nextFloat();
            out.write(string1 + "\n");
            out.flush();

            String str2 = in.readLine().trim();
            System.out.println(str2);
            Scanner scanner2 = new Scanner(System.in);
            Float string2 = scanner2.nextFloat();
            out.write(string2 + "\n");
            out.flush();

            String str3 = in.readLine().trim();
            System.out.println(str3);
            Scanner scanner3 = new Scanner(System.in);
            String string3 = scanner3.nextLine();
            out.write(string3 + "\n");
            out.flush();

            String str4 = in.readLine().trim();
            System.out.println(str4);
        }
    }
}
