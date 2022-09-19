package com.softserve.hw10.practical_tasks.first;



public class AppString {
public static void main(String[] args) {
	System.out.println("Enter first sting: ");
	String s=Src.scannerS();
	System.out.println("Enter second sting: ");
	String s1=Src.scannerS();
	System.out.println("Does first string substring second: "+s1.contains(s));
}
}
