package com.softserve.hw12.first;



//import com.softserve.dev.edu18thr.Appl;

public class Run3 implements Runnable {

	public void run() {
		int k;
		k = First.sum;
		//if(k==10) {
		for (int i = 0; i < 5; i++) {
			synchronized(First.monitor) {
				
				try {
					System.out.println("Run3");
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		}
		}
//}
		