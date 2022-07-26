package com.softserve.hw05;

import java.util.Scanner;

public class FiveNumbers {

    public static void main(String[] args) {
        int secondPositive = 0;
        int minPosition = 0;
        int min = Integer.MAX_VALUE;
        int product = 1;

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter 5 numbers: ");

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }

        // Second positive position
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (secondPositive == 0) {
                    secondPositive++;
                } else {
                    secondPositive = i;
                    break;
                }
            }
        }
        // Min value and position
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
                minPosition = i;
            }
        }
        //Product of all entered even numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                product = product * number;
            }
        }
        System.out.println("Position of the second positive number in the array is " + secondPositive + '.');
        System.out.println("Minimum value is " + min + ", its position in the array is " + minPosition + '.');
        System.out.println("The product of all entered even numbers is " + product + '.');
    }
}
