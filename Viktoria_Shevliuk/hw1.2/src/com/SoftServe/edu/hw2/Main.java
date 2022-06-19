package com.SoftServe.edu.hw2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String address;
        System.out.println("What is your name? ");
        name = sc.nextLine();
        System.out.println("Where do you live, " + name + "?");
        address = sc.nextLine();
        System.out.println("Your name is " + name + "\nYour address is " + address);
    }
}
