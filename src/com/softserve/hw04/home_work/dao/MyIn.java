package com.softserve.hw04.home_work.dao;

import java.util.Arrays;
import java.util.Scanner;

public class MyIn implements In {
    private Scanner sc;

    public MyIn() {
        sc = new Scanner(System.in);
    }

    public float readFloat(float arg0) {
        if (arg0 != 0.0f) {
            System.out.print(arg0 + ": ");
        }
        return sc.nextFloat();
    }

    public void close() {
        sc.close();
    }

}
