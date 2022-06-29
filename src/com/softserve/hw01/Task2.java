package com.softserve.hw01;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where are you live, " + name + "?");
        String address = scanner.nextLine();
        System.out.println("Your name  - " + name + ". " + "Your address - " + address);
        scanner.close();
    }
}
