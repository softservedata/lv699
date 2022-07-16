package hw05;

import java.util.Arrays;

public class ArrayOfTenIntegers {
    public static void main(String[] args) {
        int[] array = {-2, -4, -2, 6, 3, 1, 2, 1, -4, 5};
        ArrayOfTenIntegers answer = new ArrayOfTenIntegers();
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Biggest of these numbers in array: " + answer.findMax(array));
        System.out.println("Sum of positive numbers in array: " + answer.calcSum(array));
        System.out.println("Amount of negative numbers in array: " + answer.quantityNegativeNumbers(array));
        System.out.println("Values there are more: " + answer.getValuesMoreNegativeOrPositive(array));
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {    // or -> for (int i = 0; i < array.length; i++)
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public int calcSum(int[] array) {
        int sum = 0;
        for (int i : array) {    // or -> for (int i = 0; i < array.length; i++)
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int quantityNegativeNumbers(int[] array) {
        int negative = 0;
        for (int i : array) {    // or -> for (int i = 0; i < array.length; i++)
            if (i < 0) {
                negative++;
            }
        }
        return negative;
    }

    public String getValuesMoreNegativeOrPositive(int[] array) {
        int positive = 0;

        for (int i : array) {    // or -> for (int i = 0; i < array.length; i++)
            if (i > 0) {
                positive++;
            }
        }
        return (positive > quantityNegativeNumbers(array)) ? "positive" : "negative";
    }
}
