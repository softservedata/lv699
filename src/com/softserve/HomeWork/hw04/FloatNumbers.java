package com.softserve.HomeWork.hw04;

import java.util.Scanner;

public class FloatNumbers {

    private float num1, num2, num3;

    public FloatNumbers() {
        this.num1 = 0f;
        this.num2 = 0f;
        this.num3 = 0f;
    }

    public FloatNumbers(float num1, float num2, float num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getNum3() {
        return num3;
    }

    public void setNum3(float num3) {
        this.num3 = num3;
    }

    @Override
    public String toString() {
        return "FloatNumbers:" +
                "num1=" + num1 +
                "num2=" + num2 +
                "num3=" + num3 +
                ';';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter float num1: ");
        num1 = sc.nextFloat();
        setNum1(num1);

        System.out.println("enter float num2: ");
        num2= sc.nextFloat();
        setNum2(num2);

        System.out.println("enter float num3: ");
        num3 = sc.nextFloat();
        setNum3(num3);
        sc.close();

    }

    public float checkRange() {


        if (getNum1() >= -5 && getNum1() <= 5 && num2 >= -5 && num2 <= 5 && getNum3() >= -5 && getNum3() <= 5) {
            System.out.println("all three numbers are within the range[-5,5]");
        }
        else  {
            System.out.println("one of the numbers does not correspond to the specified range [-5,5]");
        }
        return 0;
    }
}



