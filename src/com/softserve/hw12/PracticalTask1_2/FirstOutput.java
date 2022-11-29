package com.softserve.hw12.PracticalTask1_2;

public class FirstOutput implements Runnable {

    @Override
    public void run() {
        boolean isWait = true;
        for (int i = 0; i < 5; i++) {
            synchronized (PracticalTask12.monitor) {
                try {
                    System.out.println("Hello, world");
                    isWait = false;
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }}}
