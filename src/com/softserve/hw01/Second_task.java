package com.softserve.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.String;

public class Second_task {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("What is youre name?");
String name = br.readLine();
System.out.println("Where are you live, " + name + "?");
String address = br.readLine();
System.out.println("You are " + name + " from " + address);
}
}
