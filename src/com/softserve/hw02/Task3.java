package com.softserve.hw02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        scanner.close();
        System.out.println("The price of the first call - " + c1 * t1);
        System.out.println("The price of the second call - " + c2 * t2);
        System.out.println("The price of the third call - " + c3 * t3);
        System.out.println("The price of all calls together - " + (c1 * t1) + (c2 * t2) + (c3 * t3));


    }
}