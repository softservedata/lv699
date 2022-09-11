package com.softserve.PracticalTask.task2;

public class WrapperApp {

    public static void main(String[] args) {
        Wrapper<String> wstr = new Wrapper<>("one");
        System.out.println("wstr = " + wstr);
        //
        Wrapper<Double> wdb = new Wrapper<>(2.51);
        System.out.println("wdb = " + wdb);
        double d = wdb.get() + 1.1;
        System.out.println("d = " + d);
    }
}
