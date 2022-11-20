package com.softserve.hw12;

public class PracticalTask12 {

    public static Object monitor = new Object();


    public static void main(String[] args) {

       //#1 task
       /* for (int i=0; i<10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);           }        }        } */

    Runnable r1= new FirstOutput();
    Thread t1= new Thread(r1);
    Runnable r2=new SecondOutput();
    Thread t2= new Thread(r2);
		t1.start();
		t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" Main DONE, My name is Liuba");
}

}



