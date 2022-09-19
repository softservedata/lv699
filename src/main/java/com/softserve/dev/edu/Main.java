package com.softserve.dev.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        System.out.print("Hello. What is your name? ");
        java.lang.String name = br.readLine();
        //
        System.out.print("How old are you? ");
        int age = Integer.parseInt(br.readLine());
        //age =Integer.parseInt("345");
        //
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        //
        br.close();
    }
}
