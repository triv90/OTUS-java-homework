package ru.otus.java.basic.three.hm13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8088)) {
            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("Client connected.");
                mathOperation(client);
            }
        }
    }

    private static void mathOperation(Socket client) throws IOException {
        Float result;
        String number;
        BufferedReader listener = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        out.write("Сетевой калькулятор может вычислять следующие математические операции: +,-,*,/" + "\n");
        out.flush();
        out.write("Введите первое число: " + "\n");
        out.flush();
        number = listener.readLine().trim();
        System.out.println(number);
        Float number1 = Float.valueOf(number);
        out.write("Введите второе число: " + "\n");
        out.flush();
        number = listener.readLine().trim();
        System.out.println(number);
        Float number2 = Float.valueOf(number);
        out.write("Пожалуйста введите знак операции " + "\n");
        out.flush();
        String operation = listener.readLine().trim();
        System.out.println(operation);
        if (operation.equals("+")) {
            result = number1 + number2;
            out.write(result + "\n");
            out.flush();
        }
        if (operation.equals("-")) {
            result = number1 - number2;
            out.write(result + "\n");
            out.flush();
        }
        if (operation.equals("*")) {
            result = number1 * number2;
            out.write(result + "\n");
            out.flush();
        }
        if (operation.equals("/")) {
            if (number2 != 0.0f) {
                result = number1 / number2;
                out.write(result + "\n");
                out.flush();
            } else {
                out.write("Делить на ноль нельзя!" + "\n");
                out.flush();
            }
        } else {
            out.write("Неправильный знак операции" + "\n");
            out.flush();
        }
    }
}
