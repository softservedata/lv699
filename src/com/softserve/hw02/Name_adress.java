package com.softserve.hw02;
import java.util.Scanner;

public class Name_adress {
    public static void main(String[] args) {
        //task 2
        String name, address;

        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        System.out.println("Where are you live, (name)?");
        address = scan.nextLine();
        System.out.println("Your name is: " + name + "." + "You live in " + address);
    }
}
