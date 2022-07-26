package com.softserve.HomeWork.hw05;

import java.util.Arrays;

//Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
//Введіть 10 цілих чисел. Обчисліть суму перших 5 елементів, якщо вони додатні, або добуток останніх 5 елементів в іншому випадку.

public class SecondTask {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, -8, 9, 10};

        SecondTask a = new SecondTask();
        System.out.println(Arrays.toString(numbers));
         System.out.println("Sum of first 5 elements = " + a.getMult(numbers));

    }
    public int getMult(int[] numbers) {
        int sum = 0;
        int mult = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0)  sum += numbers[i];
            {
                if (numbers[i]< 0) return mult=numbers[5]*numbers[6]*numbers[7]*numbers[8]*numbers[9];

            }
        }
        return sum;


    }
}












