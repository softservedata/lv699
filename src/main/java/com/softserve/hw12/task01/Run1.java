package com.softserve.hw12.task01;

public class Run1 implements Runnable {
    public void run () {
        System.out.println("#1 Thread ID = " + Thread.currentThread().getId());
        for(int i = 0; i < 5; i++) {
            System.out.println("Message from thread #1");
        }
        System.out.println("Thread #1 ended");
    }
}
