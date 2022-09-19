package com.softserve.hw12.practical_tasks.second;

public class Second {
	public static Object monitor = new Object();
	public static void main(String[] args) throws InterruptedException {
		Runnable r1= new Message1();
		Thread t1= new Thread(r1);
		Runnable r2=new Message2();
		Thread t2= new Thread(r2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("My name is Vitalii, thank you for your attention");
	}

}
