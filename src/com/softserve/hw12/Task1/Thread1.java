package com.softserve.hw12.Task1;

import com.softserve.hw12.PracticalTask1_2.PracticalTask12;

public class Thread1 implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        boolean isWait = true;
          for (int i = 0; i < 5; i++) {
            synchronized (Appl.monitor) {
                try {
                    System.out.println("Thread 0-----" + "" + i);
                    isWait = false;
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }

        }
        System.out.println("0 is finished");
    }
}

    /*Run three threads and output there different messages for 5 times.
    The third thread supposed to start after finishing working of the two previous threads.

    */


