package com.softserve.hw04;

import java.util.Scanner;

public class Numbers {

    private static void contains (float a) {
        if (a >= -5 && a <= 5) {
            System.out.println(a + " belongs to range [-5; 5]");
        } else {
            System.out.println(a + " does not belong to range [-5; 5]");
        }
    }
    //---------------------------------------------------------------------
    private static void minmax (int a, int b, int c){
        int min = 0;
        int max = 0;
        if (a > b && a > c){
            max = a;
            min = b < c ? b : c;
        } else if (b > a && b > c){
            max = b;
            min = a < c ? a : c;
        } else {
            max = c;
            min = a < b ? a : b;
        }
        System.out.println("The max number is " + max + " and the min number equals " + min);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter three float numbers: ");
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();

        Numbers.contains(a);
        Numbers.contains(b);
        Numbers.contains(c);
    //---------------------------------------------------
        System.out.print("Enter three int numbers: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        Numbers.minmax(x, y, z);


    }
}
