package com.softserve.hw05;

import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter 10 numbers: ");

        int[]numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scn.nextInt();
        }

        for (int i = 0; i < numbers.length/2; i++) {
            if (numbers[i] < 0) {
                sum = 0;
                break;
            } else {
                sum = sum + numbers[i];
            }
        }

        for(int i = 5; i < numbers.length; i++){
            product = product * numbers[i];
        }


        if (sum > 0){
            System.out.println("The sum of the first 5 numbers is " + sum);
        } else {
            System.out.println("The product of the last 5 numbers is: " + product);
        }
    }
}
