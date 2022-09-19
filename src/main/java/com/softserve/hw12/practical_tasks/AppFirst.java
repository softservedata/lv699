package com.softserve.hw12.practical_tasks;


public class AppFirst {
		public static Object monitor = new Object();

		public static void main(String[] args) throws InterruptedException {
			 for (int i = 0; i < 10; i++) {
		            System.out.println((i+1)+". I study Java");
		            Thread.sleep(1000);
		        }
		}
}
