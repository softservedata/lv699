package com.softserve.hw12.Task1;

public class Appl {
    public static Object monitor = new Object();


    public static void main(String[] args) {

System.out.println(Thread.currentThread().getName());
        Runnable r1 = new Thread1();
        Thread t1 = new Thread(r1);

        Runnable r2 = new Thread2();
        Thread t2 = new Thread(r2);

        Runnable r3 = new Thread3();
        Thread t3 = new Thread(r3);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        //




    }
}
