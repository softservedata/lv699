package com.softserve.homework.taskThread;

public class Message implements Runnable{
    private String message;
    private int numberTread;
    private int counter;
 public Message(String message,int numberTread, int counter){
     this.message=message;
     this.numberTread=numberTread;
     this.counter=counter;
 }
    @Override
    public void run() {
//        for (int i=0;i<5;i++) {
            System.out.println(counter++ +". Message for tread № " +numberTread+" is : "+message);
        }
    }
//}
