package com.softserve.hw12.task01;

public class Run3 implements Runnable {
    public void run () {
        System.out.println("#3 Thread ID = " + Thread.currentThread().getId());
        for(int i = 0; i < 5; i++) {
            System.out.println("Message from thread #3");
        }
        System.out.println("Thread #3 ended");
    }
}
