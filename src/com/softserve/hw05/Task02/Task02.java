package com.softserve.hw05.Task02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 integer numbers");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        calculator(numbers);

    }

    public static void calculator(int[] numbers) {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < numbers.length / 2; i++) {
                if (numbers[i] > 0) {
                    count++;
                }
            }
            if (count == numbers.length / 2) {
                for (int i = 0; i < numbers.length / 2; i++) {
                    sum += numbers[i];
                }
                System.out.println("The sum of first 5 elements are " + sum);
            } else {
                int product = 1;
                for (int i = 9; i >= numbers.length / 2; i--) {
                    product *= numbers[i];
                }
                System.out.println("The product of last 5 elements are " + product);
            }
    }
}
