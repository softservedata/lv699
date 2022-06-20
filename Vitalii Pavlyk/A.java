package com.softserve.edu;

public class A {
    private int i = 123;

    public void m1() {
        System.out.println("\tfrom m1(), i = " + i);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int i = 456;
        //
        A a = new A();
        System.out.println("i = " + i);
        System.out.println("a.i = " + a.i);
        A a1 = new A();
        a.i = 100;
        a1.i = 200;
        System.out.println("a.i = " + a.i);
        System.out.println("a1.i = " + a1.i);
        //
        a.m1();
        a1.m1();
    }

}