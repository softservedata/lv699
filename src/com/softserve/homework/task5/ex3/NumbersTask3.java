package com.softserve.homework.task5.ex3;

import java.util.Scanner;

public class NumbersTask3 {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();
        array[3] = scanner.nextInt();
        array[4] = scanner.nextInt();
        scanner.close();

        int count = 0;
        int numberPos = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] >= 0) {
                count++;
                if (count == 2) {
                    numberPos = array[i];
                    System.out.println("Second positive number: " + numberPos);
                }
            }

        }


        int min = array[0];
        int m = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
                m = i ;
            }
        }
        System.out.println("Min number is: " + min + " and its number :" + m);

        int product = 1;
        int count2 = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] % 2 != 0) {

                product = product * array[i];
            }
        }
        System.out.println("Product of all entered even numbers: "+product);


    }}




