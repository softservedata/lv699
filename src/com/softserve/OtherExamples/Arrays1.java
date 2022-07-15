package com.softserve.OtherExamples;

public class Arrays1 {
    public static void main(String[] args) {

        int[] numbers = new int[6];
        // System.out.println(numbers[2]);//01234
        // numbers[0] = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
        }
        for (int i = 0; i < numbers.length; i++){
        System.out.println(numbers[i]);
    }
        System.out.println();

        int[] numbers1 = {1,3,4,5,6,14};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers1[i]);
        }

    }
}
