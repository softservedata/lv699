package com.softserve.hw13;

import java.util.stream.Collectors;

public class AppCrypt {
    public String encrypt(String s, int num) {
        return s.chars() //.forEach(System.out::println);
                .boxed()
                .map(k->String.valueOf( (char)(k + num) ) )
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        String s  = "abcdefghij";
        int num = -3;
        /*
        //System.out.printf("char = " + (char)(num));
        String res = s.chars() //.forEach(System.out::println);
                .boxed()
                .map(k->String.valueOf( (char)(k + num) ) )
                .collect(Collectors.joining(""));
        System.out.println("res = " + res);
        */
        //
        AppCrypt app = new AppCrypt();
        System.out.println("res = " + app.encrypt(s, num));
    }
}
