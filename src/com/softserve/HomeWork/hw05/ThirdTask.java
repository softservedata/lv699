package com.softserve.HomeWork.hw05;

import java.util.Arrays;
import java.util.Scanner;
//Enter 5 integer numbers. Find position of second positive number;minimum and its position in the array.Count the product of all entered even numbers
//Введіть 5 цілих чисел. знайти положення другого додатного числа; мінімум і його положення в масиві.Підрахуйте добуток усіх введених парних чисел
public class ThirdTask {
    public static void main(String[] args) {
        ThirdTask object = new ThirdTask();

        int[] myarray = object.input();
        System.out.println("\narray = " + Arrays.toString(myarray));

        System.out.println("Position of second positive number is " + object.PositiveNumber(myarray));
        System.out.println("Position of minimum number is " + object.MinimumNumber(myarray));
        System.out.println("Product of all entered even numbers = " + object.multiplication(myarray));
    }

    public int[] input() {
        Scanner scan = new Scanner(System.in);
        int[] myarray = new int[5];
        System.out.println("Enter five integers numbers:");

        for (int i = 0; i < myarray.length; i++) {

            System.out.print("Position array " + "[" + (i) + "]" + "= ");
            myarray[i] = scan.nextInt();
        }
        return myarray;
    }

    public int PositiveNumber(int[] array) {
        int positiveCount = 0;
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    position = i;
                }
            }
        }
        return position;
    }

    public int MinimumNumber(int[] array) {
        int minimum = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minimum) {
                position = i;
            }
        }
        return position;
    }

    public int multiplication(int[] array) {
        int number = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                if (array[i] % 2 == 0) {
                    number *= array[i];
                }
            }
        }
        return number;
    }
}
