package com.softserve.hw12.task03;

public class ThreadStarter {
    public static final Object first = new Object();
    public static final Object second = new Object();
    public static final Object third = new Object();

    public static void main(String[] args) {

        Thread t3 = new Thread() {
            public void run() {
                synchronized (third) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread number two");
                    }
                    t3.start();
                }
            }
        };

        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                //  System.out.println("Thread number one started");
                    t2.start();
                }
            }
        };

        t1.start();
    }
}
