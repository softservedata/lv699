package com.softserve.hw04.home_work;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numbers:");
        Range range = new Range(sc.nextFloat(), sc.nextFloat(),sc.nextFloat());
        System.out.println("Your numbers: "+range.toString());

        System.out.println("Numbers are belong range [-5,5]:"+ range.belong());
    }
}
