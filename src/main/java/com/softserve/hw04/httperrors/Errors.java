package com.softserve.hw04.httperrors;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please type error number: ");
        int error = scn.nextInt();
        switch (error) {
            case 400:
                HTTPErrors.ERROR400.printName();
                break;
            case 401:
                HTTPErrors.ERROR401.printName();
                break;
            case 402:
                HTTPErrors.ERROR402.printName();
                break;
            case 403:
                HTTPErrors.ERROR403.printName();
                break;
            case 404:
                HTTPErrors.ERROR404.printName();
                break;
            default:
                System.out.println("Unknown error");
        }
    }
}
