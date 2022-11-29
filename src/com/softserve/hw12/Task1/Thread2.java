package com.softserve.hw12.Task1;

public class Thread2 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
boolean isWait = true;
        for (int i = 0; i < 5; i++) {
            synchronized (Appl.monitor) {
                try {
                    System.out.println("Thread 1-----" + "" + i);
                    isWait = false;
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }

        }
        System.out.println("1 is finished");
    }
}