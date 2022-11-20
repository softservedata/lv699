package com.softserve.hw12;

public class SecondOutput implements Runnable {
    @Override
    public void run() {

            boolean isWait = true;
            for (int i = 0; i < 5; i++) {
                synchronized (PracticalTask12.monitor) {
                    try {
                        System.out.println("Peace in the Peace");
                        isWait = false;
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }
            }
    }
}
