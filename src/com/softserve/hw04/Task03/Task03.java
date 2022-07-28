package com.softserve.hw04.Task03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 integer numbers");
        int[] numbers = new int[5];
        int min = Integer.MAX_VALUE;
        int sp = 0;
        int count = 0;
        int position = 0;
        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 0) {
                count++;
            }
            if (count == 2) {
                sp = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                position = i;
            }
            if (numbers[i] % 2 == 0) {
                product *= numbers[i];
            }
        }

        System.out.println("Position of second positive number " + sp );
        System.out.println("Minimum is " + min + " Position in the array is " + position);
        System.out.println("The product of all entered even numbers " + product);

    }
}

