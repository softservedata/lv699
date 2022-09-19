package com.softserve.hw04.Task02;

import java.util.Scanner;

public class Numbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Numbers.contains(scanner.nextFloat());
        Numbers.contains(scanner.nextFloat());
        Numbers.contains(scanner.nextFloat());

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        Numbers.min(n1,n2,n3);
        Numbers.max(n1,n2,n3);

        scanner.close();


    }

    public static void contains(float n) {
        if (n >= -5 && n <= 5 ) {
            System.out.println("This number belong to the range [-5,5] ");
        } else {
            System.out.println("This number don't belong to the range [-5,5]");
        }
    }

    public static void min(int...n) {
        int min = Integer.MAX_VALUE;
        for (int i : n) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("MIN value is: " + min);
    }
        public static void max(int...n){
        int max = Integer.MIN_VALUE;
        for (int i:n) {
            if (i > max) {
                max = i;
            }
        }
            System.out.println("MAX value is: " + max);
    }

}
