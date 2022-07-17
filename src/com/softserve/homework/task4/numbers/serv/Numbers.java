package com.softserve.homework.task4.numbers.serv;

public class Numbers {
    private float a;
    private int b;

    public float numbersFloat() {
        float maxF = -5.0F;
        float minF = 5.0F;
        if (minF >= a && a <= maxF) {
            System.out.println("your float number is good" + a);
        } return a;
    }
    public int numbersInt() {
        int maxI = -5;
        int minI = 5;

        if (minI >= b && b <= maxI) {
            System.out.println("your float number is good" + b);
        } return b;
    }


}
