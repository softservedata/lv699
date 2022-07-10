package com.softserve.hw05.practicalTask;

import java.util.Scanner;

public class HomeworkPart1 {
    //1. Ask user to enter the number of month. Read the value and write the number of days in this month (create array with amount days of each month).

    public static void main(String[] args) {

       int daysOfMonth[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Input the number of current month");
        Scanner console = new Scanner(System.in);
        int currentMonth = console.nextInt();
        int n = currentMonth - 1;
        System.out.println("CurrentMonth has " + daysOfMonth[n] + "days");

        // 2. Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
        System.out.println("Input ten integer numbers");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
        }
        int sum = 0;
        int j = 0;
        if  ( array[0] > 0 && array[1] > 0 && array[2] > 0 && array[3] > 0 &&  array[4] > 0) {
            int i;
            for (i = 0; i < 5; i++)
                sum = sum + array[i];
            i++;
            System.out.println("sum = " + sum);
        } else {

        int product = 1;
                for ( int i= array.length-1; i > 4; i--) {
                product = product * array[i];
                } System.out.println("product = "+ product);
        }
        // 3. Enter 5 integer numbers.
        int arrayMin [] = new int [] {-5, -2, 16, -99, 156};

        //Find position of second positive number;
        int count=0;
        int k = 0;
        int secondPositivePosition = 0;
        while (k < arrayMin.length) {
            if (arrayMin[k] > 0) {
                count++;
                if (count==2) {
                    secondPositivePosition = k;
                    System.out.println("second Positive Position is: " + secondPositivePosition);
                }
            }
            k++;
        }
        if  (count!=2) {
            System.out.println("We dont have 2 positive numbers");
        }

        //Find minimum and its position in the array.
        int min = arrayMin[0];
        int imin = 0;
        int i = 0;
        while (i<arrayMin.length) {
            if (arrayMin[i]<min) {
                min = arrayMin[i];
                imin = i;
            }
            i++;
        }
        System.out.println(" min = "+ min + ", position =  " + imin);

        // Count the product of all entered even numbers.
        int productEven = 1;
        for (i=0; i< arrayMin.length; i++){
                if (arrayMin[i] % 2 == 0) {
                    productEven = productEven * arrayMin[i];
                }
            }
        System.out.println("Product of ewen numbers is "+ productEven);
    }
            }



