package com.softserve.hw12.task01;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread ID = " + Thread.currentThread().getId());
        //
        Runnable r1 = new Run1();
        Thread t1 = new Thread(r1);
        //
        Runnable r2 = new Run2();
        Thread t2 = new Thread(r2);
        //
        Runnable r3 = new Run3();
        Thread t3 = new Thread(r3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        System.out.println("Main Thread DONE");
    }
}
