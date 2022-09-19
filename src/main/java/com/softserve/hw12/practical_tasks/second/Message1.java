package com.softserve.hw12.practical_tasks.second;

//import com.softserve.dev.edu18thr.Appl;

public class Message1 implements Runnable {

	public void run() {
		boolean isWait = true;
		for (int i = 0; i < 5; i++) {
			synchronized (Second.monitor) {
				try {
						System.out.println((i+1)+". Hello, world");
						isWait = false;
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}
}
