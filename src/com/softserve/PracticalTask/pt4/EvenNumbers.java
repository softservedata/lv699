package com.softserve.PracticalTask.pt4;

import java.util.Scanner;

public class EvenNumbers {
    private int num1, num2, num3;

    public EvenNumbers() {
        this.num1 = 0;
        this.num2 = 0;
        this.num3 = 0;
    }

    public EvenNumbers(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    @Override
    public String toString() {
        return "EvenNumbers{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter int num1: ");
        num1 = sc.nextInt();
        setNum1(num1);

        System.out.println("enter int num2: ");
        num2 = sc.nextInt();
        setNum2(num2);

        System.out.println("enter int num3: ");
        num3 = sc.nextInt();
        setNum3(num3);
        sc.close();
    }

    public void checkEven() {
        if (num1 % 2 == 0) {
            System.out.println("num1="+num1 + " even number");
        } else {
            System.out.println("num1=" +num1+" odd number");

        }
        {
            if (num2 % 2 == 0) {
                System.out.println("num2=" +num2+" even number");
            } else {
                System.out.println("num2=" +num2+" odd number");

            }
            {
                if (num3 % 2 == 0) {
                    System.out.println("num3=" +num3+ " even number");
                } else {
                    System.out.println("num3=" +num3+ " odd number");

                }

            }
        }
    }
}
