package com.softserve.hw12.task01;

public class Run2 implements Runnable {
    public void run () {
        System.out.println("#2 Thread ID = " + Thread.currentThread().getId());
        for(int i = 0; i < 5; i++) {
            System.out.println("Message from thread #2");
        }
        System.out.println("Thread #2 ended");
    }
}
