package com.softserve.hw10.practical_tasks.first;

import java.util.*;

public class Src {
private static Scanner sc;
public static int scanner() {
	int id=0;
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
