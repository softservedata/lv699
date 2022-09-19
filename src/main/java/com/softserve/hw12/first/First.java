package com.softserve.hw12.first;
//Run three threads and output there different messages for 5 times. 
//The third thread supposed to start after finishing working of the two previous threads.


public class First {
	public static int sum = 0;
	public static Object monitor = new Object();
	public static void main(String[] args) throws InterruptedException {
		//System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new Run1();
		Thread t1 = new Thread(r1);
		
		Runnable r2 = new Run2();
		Thread t2 = new Thread(r2);
		Runnable r3 = new Run3();
		Thread t3 = new Thread(r3);
	//	t3.setPriority(Thread.MIN_PRIORITY);
		//t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	//	Thread.sleep(100);
//		boolean b =t2.isAlive();
//		while(b==false) {
			t3.start();
		t3.join();
//			b=true;
//		}
		
		//


		
		//
		//t1.start(); // Thread t1 Dead
//        for (int i = 0; i < 10000; i++) {
//        	Thread.yield();
//        }
		// System.out.print("Main Thread ID = " + Thread.currentThread().getId());
	}

}
