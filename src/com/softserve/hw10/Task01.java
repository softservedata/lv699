package com.softserve.hw10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            double d = div(scanner.nextDouble(), scanner.nextDouble());
            System.out.println(d);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }

    public static double div(double d1, double d2) {
        return d1 / d2;
    }

}
