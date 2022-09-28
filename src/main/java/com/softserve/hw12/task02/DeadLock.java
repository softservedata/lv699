package com.softserve.hw12.task02;

public class DeadLock {
    public static final Object first = new Object();
    public static final Object second = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    Thread.yield();
                    synchronized (first) {
                        System.out.println("Success1");
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }
}
