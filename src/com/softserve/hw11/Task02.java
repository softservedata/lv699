package com.softserve.hw11;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String res = str.replaceAll(" +"," ");
        System.out.println(res);
    }
}
