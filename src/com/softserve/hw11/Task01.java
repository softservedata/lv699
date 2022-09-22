package com.softserve.hw11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        String stream = Arrays.stream(str)
                .max((s1, s2) -> s1.length() - s2.length()).get();
        System.out.println(stream);
        System.out.println(stream.length());

        StringBuilder stringBuilder = new StringBuilder(str[1]);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        System.out.println(reverse);

    }
}
