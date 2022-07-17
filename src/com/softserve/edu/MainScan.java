package com.softserve.edu;

import java.io.IOException;
import java.util.Scanner;

public class MainScan {
    public static void main(String[] args) throws IOException {
        //
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("Hello. What is your name? ");
        String name = sc.nextLine();
        //
//        System.out.print("Hello. What is your street? ");
//        String street = sc.nextLine();
        //
        System.out.print("How old are you? ");
        int age = sc.nextInt();
        //
        System.out.print("you id = ");
        int id = sc.nextInt();
        //
        System.out.print("Hello. What is your street? ");
        String street = sc.nextLine();
        //street = sc.nextLine();
        //
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        System.out.println("You id " + id);
        System.out.println("You live in  " + street);
        //
        sc.close();
    }
}
