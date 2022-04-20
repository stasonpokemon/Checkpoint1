package com.epam.trebnikov.Gradle.GradleHW.GradleParent.GradleImpl.src.main.java;

import java.util.Scanner;

public class ServiceImpl implements Service {
    public static void main(String[] args) {
        System.out.println("Hello gradle!!!");
        String message = write();
        if (message.length() > 20) {
            System.out.println("Message is too long...");
        } else {
            System.out.println(message);
        }
    }


    private static String write() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some message...");
        return scanner.nextLine();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
