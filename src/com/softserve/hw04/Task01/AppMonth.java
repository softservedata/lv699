package com.softserve.hw04.Task01;


import java.util.Scanner;

public class AppMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 12");
        int numberOfMonth = scanner.nextInt();
        getMonth(numberOfMonth);


    }

    public static void getMonth(int numberOfMonth) {
        Month[] months = Month.values();
        if (numberOfMonth >= 1 && numberOfMonth <= 12){
            for (int i = 0; i < months.length ; i++) {
                if(numberOfMonth == i+1){
                    System.out.println("Your month is " + months[i].getName());
                }
            }
        } else {
            System.out.println("Your number is not correct");
        }
    }
}
