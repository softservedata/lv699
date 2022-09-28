package com.softserve.hw05;

import java.util.Scanner;

public class Month {

    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public void monthInfo(int monthNumber) {
        if(monthNumber > 0 && monthNumber < 13) {
            String nameOfMonth = String.format("The name of month No. %d is %s. ", monthNumber, monthName[monthNumber - 1]);
            String numberOfDays = String.format("The number of days in %s is %d.", monthName[monthNumber - 1], daysInMonth[monthNumber - 1]);
            System.out.println(nameOfMonth + '\n' + numberOfDays);
        } else {
            System.out.println("Invalid number, please try again");
        }

    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Please enter number of month: ");
        int monthNumber = scn.nextInt();

        new Month().monthInfo(monthNumber);

        scn.close();
    }
}
