package hw05;

import java.util.Arrays;
import java.util.Scanner;

public class FindPositionNumber {
    public static void main(String[] args) {
        FindPositionNumber answer = new FindPositionNumber();

        int[] array = answer.createArrayFiveIntegers();
        System.out.println("\narray = " + Arrays.toString(array));

        System.out.println("Position of second positive number is " + answer.findPositionOfSecondPositiveNumber(array));
        System.out.println("Position of minimum number is " + answer.findPositionOfMinimumNumber(array));
        System.out.println("Product of all entered even numbers = " + answer.calcProductOfAllEnteredNumbers(array));
    }

    public int[] createArrayFiveIntegers() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter five integers into an array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Position array " + "[" + (i + 1) + "]" + "> ");
            array[i] = scan.nextInt();
        }
        return array;
    }

    public int findPositionOfSecondPositiveNumber(int[] array) {
        int positiveCount = 0;
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    position = i + 1;
                }
            }
        }
        return position;
    }

    public int findPositionOfMinimumNumber(int[] array) {
        int minimum = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minimum) {
                position = i + 1;
            }
        }
        return position;
    }

    public int calcProductOfAllEnteredNumbers(int[] array) {
        int product = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                if (array[i] % 2 == 0) {
                    product *= array[i];
                }
            }
        }
        return product;
    }
}
