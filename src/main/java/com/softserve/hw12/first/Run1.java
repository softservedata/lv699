package com.softserve.hw12.first;



//Run three threads and output there different messages for 5 times. 
//The third thread supposed to start after finishing working of the two previous threads.

public class Run1 implements Runnable {

	public void run() {
		int k;
		for (int i = 0; i < 5; i++) {
			synchronized(First.monitor) {
				k = First.sum;
				try {
					System.out.println("Run1");
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				First.sum=k+1;
			}
			
		}
		
	}
}

