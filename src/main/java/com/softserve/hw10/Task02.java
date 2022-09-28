package com.softserve.hw10;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.print("Enter a sentence that contains more than one space between the words: ");
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();

        text = text.replaceAll("\\s+", " ").trim();
        System.out.println("Whitespaces deleted : " + text);
    }
}
