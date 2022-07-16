package hw05;

import java.util.Arrays;

public class SumFirst5IfProductLast5 {
    public static void main(String[] args) {
        int[] array = {2, -3, -4, 1, 2, 2, 4, 8, 1, 1};

        SumFirst5IfProductLast5 answer = new SumFirst5IfProductLast5();
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Sum of first 5 elements = " + answer.getCalcSum(array));
        System.out.println("Product of last 5 elements = " + answer.getCalcProduct(array));
    }

    public int getCalcSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public int getCalcProduct(int[] array) {
        int product = 1;
        for (int i = array.length - 5; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }
}


