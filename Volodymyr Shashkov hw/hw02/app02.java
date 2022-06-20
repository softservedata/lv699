package com.softserve.hw02;

import java.util.Scanner; // імпорт сканера

class app02 {
	public static void main(String args[])
	{

		System.out.println("What is your name?");
		System.out.print("_");

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println ("Where do you live " + name+"?");
		System.out.print("_");
		String adress = scan.nextLine();
		
	
		
		System.out.println ("Name "+name+" Adress "+adress);
		
	}
}
