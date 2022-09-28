package com.softserve.hw10;

import java.util.Scanner;
import java.util.regex.*;

public class Task03 {
    public static void main(String[] args) {
        System.out.print("Enter a text to check for currencies: ");
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();

        Pattern p = Pattern.compile("\\$\\s* \\d+\\.\\d{2}");
        Matcher m = p.matcher(text);

        while(m.find()){
            String money = text.substring(m.start(), m.end());
            System.out.println(money);
        }
    }
}
