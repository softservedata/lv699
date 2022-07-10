package com.softserve.hw05.practicalTask;

import java.util.Arrays;

public class PracticalTask1 {
    public static void main(String[] args) {
        //Create an array of ten integers.
        int numbers[] = {25, 48, 3, -15, -3, 2, -96, 100, 89, -33};

        // Display the biggest of these numbers;
        int imax = 0;
        int max = numbers[imax];
        System.out.println("Current max = " + max + "  position = " + (imax + 1));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                imax = i;
                max = numbers[imax];
                System.out.println("Current max = " + max + "  position = " + (imax + 1));
            }
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

 int sum = 0;
        // Display the sum of positive numbers in the array;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println("Suma = " + sum);

// Display the amount of negative numbers in the array.
        int amountNeg= 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                amountNeg++;
            }
        }
        System.out.println("Amount of negative numbers= " + amountNeg);
        int amountPos= 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >=  0) {
                amountPos++;
            }
        }
        System.out.println("Amount of positive numbers= " + amountPos);
       // What values there are more: negative or positive?
        if (amountNeg > amountPos) {
            System.out.println("There are more negative numbers");
        } else System.out.println("There are more positive numbers");


    }
    }
