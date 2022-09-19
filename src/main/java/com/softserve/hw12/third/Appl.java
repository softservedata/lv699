package com.softserve.hw12.third;

public class Appl {
	public final static Object first = new Object();
	public final static Object second = new Object();
	public final static Object third = new Object();

	public static void main(String s[]) {
		Thread t3 = new Thread() {
			   public void run() {
			      synchronized (third) {
			    	  for(int i=0;i<5;i++) {
			            System.out.println("Thread number three");
			    	  }
			         }
			//      System.out.println("Main end");
			   }
			};
		   Thread t2 = new Thread() {
			   public void run() {
			      synchronized (second) {
			    	  for(int i=0;i<3;i++) {
			    	  System.out.println("Thread number two");
			    	  }
			    	  t3.start();
			      }
			   }
			};
	   Thread t1 = new Thread() {
	   public void run() {
	      synchronized (first) {
	        t2.start();  }  }  
	   };
		t1.start();
		}
		}