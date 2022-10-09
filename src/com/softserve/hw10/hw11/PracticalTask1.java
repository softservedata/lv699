package com.softserve.hw10.hw11;

import java.io.IOException;
import java.util.Scanner;

public class PracticalTask1 {

    static int s = 0;
static Scanner sc = new Scanner(System.in);

    public static int squareRectangle() {
        try {
            System.out.println("a = ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("b = ");
            int b = Integer.parseInt(sc.nextLine());

            if ((a | b)<0 ) {
                throw new IllegalArgumentException("You have entered incorrect data");
            }
            return s = a * b;

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            return -1;

        } finally {
            System.out.println("Finnally");
            try {
                sc.close();
            } catch (Exception e) {
               System.out.println("Scanner is already closed");
            }
        }

    }

    public static void main(String[] args) {
        try {
            System.out.println("s = " + squareRectangle());
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Error" + e.getMessage());

        }catch (Exception e) {
            System.out.println("Exception Error: " + e.getMessage());

        }
    }
}