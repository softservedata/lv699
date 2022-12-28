package com.softserve.hw01;


public class Chernetka {

        private static byte b = 0x0F;

    public static void main(String[] args) {

        System.out.println("b0= " + b);
        b = (byte)(b | 0xF0);
        System.out.println("b1= " + b);
        int k = b;
        System.out.println("b2= " + k);
        k = k & 0x000000FF;
        System.out.println("b3= " + k);

    }
}