package com.softserve.hw13.DateValidator;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the date: ");
        String date = scn.nextLine();

        DateValidator validator = new DateValidator(DateTimeFormatter.ofPattern("MM.dd.yy"));
        System.out.print("Check if date format is MM.dd.yy: ");
        System.out.println(validator.isValid(date));
    }
}
