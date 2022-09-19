package com.softserve.hw12.practical_tasks.second;

//import com.softserve.dev.edu18thr.Appl;

public class Message2 implements Runnable {

	public void run() {
		boolean isWait = true;
		for (int i = 0; i < 5; i++) {
			synchronized (Second.monitor) {
				try {
						System.out.println((i+1)+". Peace in the peace");
						isWait = false;
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}
}