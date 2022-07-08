package com.softserve.edu09.dao;

import java.util.Arrays;
import java.util.Scanner;

public class MyIn implements In {
    private Scanner sc;

    public MyIn() {
        sc = new Scanner(System.in);
    }

    public int readInt(String... msg) {
        if (msg != null) {
            System.out.print(Arrays.toString(msg) + ": ");
        }
        return sc.nextInt();
    }

    public void close() {
        sc.close();
    }

}
