package com.softserve.edu09tr.train;

public class Parent {
	
	//protected int f() {
	//private final int f() {
	int f() {
		System.out.println("running f() from Parent");
		return 1;
	}

	public int useF() {
		return f();
	}
}
