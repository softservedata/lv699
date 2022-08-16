package com.softserve.homework.taskThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMessage {

    public static void main(String[] args) throws Exception {
        Message message1 = new Message("Hello", 1,1);
        Message message2 = new Message("I am ready", 2,1);
        Message message3 = new Message("I am starting after first and second tread", 3,1);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        message1.run();
//        message2.run();
//        message3.run();

        for (int i = 0; i < 5; i++) {
            executorService.submit(message1);
            executorService.submit(message2);
            try {
                Thread.interrupted();
            } catch (Exception e) {
                e.printStackTrace();
            }
            executorService.submit(message3);
        }
        
    }
}