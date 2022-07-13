package com.softserve.HomeWork.hw04;

import java.util.Scanner;

public class IntNumbers {
    private int a1,a2,a3;

    public IntNumbers() {
        this.a1 =0;
        this.a2 = 0;
        this.a3 = 0;


    }
    public IntNumbers(int a1, int a2, int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public void setA3(int a3) {
        this.a3 = a3;
    }

    public int getA1() {
        return a1;
    }

    public int getA2() {
        return a2;
    }

    public int getA3() {
        return a3;
    }

    @Override
    public String toString() {
        return "IntNumbers{" +
                "a1=" + a1 +
                "a2=" + a2 +
                "a3=" + a3 +
                '}';
    }
    public void input( ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter int a1: ");
        int a1 = sc.nextInt();
        setA1(a1);

        System.out.println("enter int a2: ");
        int a2 = sc.nextInt();
        setA2(a2);

        System.out.println("enter int a3: ");
        int a3 = sc.nextInt();
        setA3(a3);
        sc.close();
    }
    public void output(){
        System.out.println("you enter a1: "+ getA1()
                + "\nyou enter a2: "+ getA2()
                + "\nyou enter a3: "+ getA3() + "\n***************");
    }


    public String maxN() {
        int max = 0;

        if (a1 > a2) {
            max = a1;
        } else max = a2;
        if (max > a3) {

        } else max = a3;
        System.out.println("Max =  " + max);

        return null;
    }

    public void minN() {
        int min = a2;

        if (a1 > a2) {
            min = a2;
        } else min = a1;
        if (min > a3) {
            min = a3;
        }
        System.out.println("Min =  " + min);

    }



}
