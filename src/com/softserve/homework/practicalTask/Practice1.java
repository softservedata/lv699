package com.softserve.homework.practicalTask;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int[]array=new int[3];

        System.out.println("Entered tree number :");
for(int i=0;i<array.length;i++){
    array [i]= scanner.nextInt();
}
System.out.println("You entered numbers:"+ Arrays.toString(array));


           int count = 0;
           for(int i=0;i<array.length;i++) {
               if (array[i] % 2 != 0) {
                   count++;
               }

           }System.out.println("Count of odd numbers is:"+count);
       }
    }

