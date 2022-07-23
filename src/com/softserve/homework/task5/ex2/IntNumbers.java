package com.softserve.homework.task5.ex2;

import java.util.Scanner;

public class IntNumbers {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers:");
        Scanner scanner = new Scanner(System.in);
        int []array=new int[10];
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();
        array[3] = scanner.nextInt();
        array[4] = scanner.nextInt();
        array[5] = scanner.nextInt();
        array[6] = scanner.nextInt();
        array[7] = scanner.nextInt();
        array[8] = scanner.nextInt();
        array[9] = scanner.nextInt();
      if (array[0]>=0&&array[1]>=0&&array[2]>=0&&array[3]>=0&&array[4]>=0){
          int resultSum=array[0]+array[1]+array[2]+array[3]+array[4];
          System.out.println("Sum:"+resultSum);
      }else {
int resultProduct=array[5]*array[6]*array[7]*array[8]*array[9];
          System.out.println("Product:"+resultProduct);
      }


    }
}