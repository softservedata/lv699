package com.softserve.hw09.third_task;

import java.util.*;

public class Src {
private static Scanner sc;
public static Integer scanner() {
	System.out.println("Enter course, please");
	Integer id=0;
	sc=new Scanner(System.in);
	id=sc.nextInt();
	return id;
}
public static String scannerS() {
	sc=new Scanner(System.in);
	return sc.nextLine();
	}
public static void close() {
	sc.close();
}

}
