package com.softserve.hw01;

import java.util.Scanner;
import java.lang.String;

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //
        System.out.print("Call price from country No.1 is ");
        double c1 = scn.nextDouble();
        System.out.print("Time your call lasts: ");
        double t1 = scn.nextDouble();
        double price1 = c1*t1;
        System.out.println("The price for the call is " + price1);

        //
        System.out.print("Call price from country No.2 is ");
        double c2 = scn.nextDouble();
        System.out.print("Time your call lasts: ");
        double t2 = scn.nextDouble();
        double price2 = c2*t2;
        System.out.println("The price for the call is " + price2);
        //
        System.out.print("Call price from country No.3 is ");
        double c3 = scn.nextDouble();
        System.out.print("Time your call lasts: ");
        double t3 = scn.nextDouble();
        double price3 = c3*t3;
        System.out.println("12The price for the call is " + price3);
        //
        double total = price1 + price2 + price3;
        System.out.println("Total price for the last 3 phone calls is " + total + " USD.");
    }
}
