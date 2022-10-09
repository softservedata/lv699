package com.softserve.hw10.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1_2 {

    public int readNumber(int start, int end){

        int [] nums2 = new int [10];
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            for ( int i = 0; i<nums2.length; i++){
                System.out.println("Input number from rang: [" + start+ ","+ end +"].");
                System.out.println("[" + i + "]");
                nums2[i] =  Integer.parseInt(br.readLine());
             if ((nums2[i]>start) & (nums2[i]<end)){
                } else {
                    throw new ArithmeticException("your digit isn't from the rang");
                }
            }
            Arrays.sort(nums2);
            System.out.println("digits from rang: " + Arrays.toString(nums2));
            return 1;

        } catch (ArithmeticException e1) {
            System.out.println("You entered a digit outside the rang: [" + start+ ","+ end +"]." + e1.getMessage());
            return -1;
        } catch (NumberFormatException | IOException e2) {
            System.out.println("You entered the wrong data: " + e2.getMessage());
            return -2;
        }
    }

    public static void main(String[] args) {
        Task1_2 workObject = new Task1_2();
        workObject.readNumber(1,100);
    }
}
