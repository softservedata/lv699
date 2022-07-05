package com.softserve.hw04.PracticalTAsk;

import java.util.Scanner;

public class Practical_Task {
    // Enter three numbers. Find out how many of them are odd.
    public static int count = 0;


    public static void main(String[] args) {

        int number[] = new int[3];
        for (int i = 0; i < number.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Imput integer number");
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                count++;
            }

            System.out.print("number [" + i + "] = " + number[i] + ". ");
            System.out.println();
        }
        System.out.println("We have " + count + " odd numbers. ");





    }



}








