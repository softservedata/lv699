package com.softserve.homework.task4.numbers.dao;

import java.util.Arrays;
import java.util.Scanner;


public class Input implements In{
    private Scanner scanner;
    public Input(){
        scanner=new Scanner(System.in);
    }
    public float readFloat(String... msg) {
        if (msg != null) {
            System.out.print(Arrays.toString(msg) + ": ");
        }
        return scanner.nextFloat();
    }
    public int readInt(String... msg) {
        if (msg != null) {
            System.out.print(Arrays.toString(msg) + ": ");
        }
        return scanner.nextInt();
    }

    public void close() {
        scanner.close();
    }
}
