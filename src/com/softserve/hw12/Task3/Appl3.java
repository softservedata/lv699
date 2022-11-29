package com.softserve.hw12.Task3;

public class Appl3 {
    /* Create a thread «one», which would start the thread «two»,
    which has to output its number («Thread number two») 3 times and create thread «three»,
     which would to output message «Thread number three» 5 times.
     */
    public final static Object first = new Object();
    public final static Object second = new Object();
    public final static Object third = new Object();

    public static void main(String[] args) {
        Thread t3 = new Thread() {
            public void run() {
                synchronized (third){
                    for (int i = 0; i < 5; i++)
                        System.out.println("Thread number three");
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                synchronized (second){
                    for (int i = 0; i < 3; i++)
                    System.out.println("Thread number two");
                }
                t3.start();
            }
        };
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first){
                    t2.start();
                }
            }
        };
        t1.start();
    }
}
