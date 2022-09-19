package com.softserve.hw12.first;

//import com.softserve.dev.edu18thr.Appl;

public class Run2 implements Runnable {

	public void run() {
		int k;
		for (int i = 0; i < 5; i++) {
			synchronized(First.monitor) {
				k =First.sum;
				try {
					System.out.println("Run2");
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				First.sum=k+1;
			}
			
		}
		
	}
}