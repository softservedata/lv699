package com.softserve.dev.edu.edu09.dao;

import java.util.Arrays;
import java.util.Scanner;

public class MyIn implements In {
    private Scanner sc;

    public MyIn() {
        sc = new Scanner(System.in);
    }

    private void printMsg(String... msg) {
        if (msg != null) {
            System.out.print(Arrays.toString(msg) + ": ");
        }
    }

    public int readInt(String... msg) {
        printMsg(msg);
        //String s = sc.nextLine();
        //System.out.println("s = " + s);
        //return Integer.valueOf(s);
        //return Integer.valueOf(sc.nextLine());
        return sc.nextInt();
    }

    public float readFloat(String... msg) {
//        if (msg != null) {
//            System.out.print(Arrays.toString(msg) + ": ");
//        }
        printMsg(msg);
        //sc.reset();
        //String s = sc.nextLine();
        //System.out.println("s = " + s);
        //return Float.valueOf(s);
        //return Float.valueOf(sc.nextLine());
        return sc.nextFloat();
    }

    public void close() {
        sc.close();
    }

}
