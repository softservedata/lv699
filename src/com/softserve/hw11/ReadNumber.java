package com.softserve.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReadNumber {

    private int start;
    private int end;


    public int readNumber(int start, int end){
        this.start = start;
        this.end = end;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print(String.format("Enter the number in a range from %d to %d: ", start, end));
            int a = Integer.parseInt(br.readLine());
            if (a > start && a < end) {
                return a;
            } else {
                throw new ArithmeticException();
            }
        } catch (IOException e) {
            System.out.println("Invalid input. Try again.");
            return -1;
        } catch (ArithmeticException ae) {
            System.out.println("Exception. Number out of bounds.");
            return -2;
        } catch (Exception e) {
            System.out.println("Unknown exception.");
            return -3;
        }
    }

    public static void main(String[] args) {
// entering 10 numbers to array using method readNumber
        int[] numbers = new int [10];
        ReadNumber rn = new ReadNumber();
        for (int i = 0; i < numbers.length; i++) {
            int number = rn.readNumber(1, 100);
            if (number != -1 && number != -2 && number != -3){
                numbers[i] = number;
            } else {
                i--;
            }
        }

// sorting an array
        Arrays.sort(numbers);

// printing the final variant as requested
        String result = String.valueOf(rn.start) + " < ";
        for (int number : numbers) {
            result = result + String.valueOf(number) + " < ";
        }

        result = result + String.valueOf(rn.end);
        System.out.println("\nOutput of entered numbers in an increasing manner: \n\t" + result);
    }
}
