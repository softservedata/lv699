package com.softserve.hw01;

import java.util.Scanner;
import java.lang.String;

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("What is your name?");
        java.lang.String name = scn.nextLine();
        System.out.println("Where do you live, " + name + "?");
        java.lang.String adress = scn.nextLine();
        System.out.println("Nice to meet you, " + name + " from the " + adress + "!");
        scn.close();
    }
}
