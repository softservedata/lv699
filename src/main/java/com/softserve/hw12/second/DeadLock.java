package com.softserve.hw12.second;

public class DeadLock {
public final static Object first = new Object();
public final static Object second = new Object();

public static void main(String s[]) {
   Thread t1 = new Thread() {
   public void run() {
      synchronized (first) {
         Thread.yield();
         synchronized (second) {
            System.out.println("Success!");
   }  }  }  
   };
   Thread t2 = new Thread() {
	   public void run() {
	      synchronized (second) {
	         Thread.yield();
	         synchronized (first) {
	            System.out.println("Success!");
	         }
	      }
	      System.out.println("Main end");
	   }
	};
	t1.start();
	t2.start();
	if(t2.isAlive()){
		System.out.println("Thread run");
	}
	
	}
	}

