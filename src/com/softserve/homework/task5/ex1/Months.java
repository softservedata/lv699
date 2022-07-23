package com.softserve.homework.task5.ex1;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        int month = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter number of month:");
        if ((month <= 12) || (month >= 1)) {
            month = sc.nextInt();
            System.out.println("Hello, you enter month number: " + month);
        }
        sc.close();


        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < monthDays.length; i++) {
            if ( month==i+1) {
                int m = monthDays[i];
                System.out.println("Your month is:"+ month+", has "+m+ " days.");
            }
        }
    }
}