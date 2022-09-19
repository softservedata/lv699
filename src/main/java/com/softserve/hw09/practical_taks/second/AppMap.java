package com.softserve.hw09.practical_taks.second;

import java.util.*;


public class AppMap {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
//	Add to employeeMap seven pairs (ID, name) of some persons. 
//	Display the map on the screen.
	map.put(1, "Stiven");
	map.put(2, "Stepan");
	map.put(3, "Jack");
	map.put(4, "Ivan");
	map.put(5, "Volodymyr");
	map.put(6, "Maksym");
	map.put(7, "Oleksandr");
	System.out.println("This is my map"+map);
//	Ask user to enter ID, 
//	then find and write corresponding name from your map.
//	If you can't find this ID - say about it to user 
//	(use function containsKey()).
	System.out.println("Enter please your ID");
	int key=0;
	while(!map.containsKey(key=Src.scanner())) {
	System.out.println("I can't find this ID");
	}
	System.out.println(map.get(key));
//	Ask user to enter name, 
//	verify than you have name in your map and write corresponding ID. 
//	If you can't find this name - say about it to user (use function containsValue()). 

	System.out.println("Enter please your name");
	Iterator iter = map.entrySet().iterator();
	String name="";
	while (iter.hasNext()) {   
		Map.Entry entry = (Map.Entry)iter.next();
		while(!map.containsValue(name=Src.scannerS())) {
			System.out.println("I can't find this name");
			}
		System.out.println("Your key ->"+entry.getKey());
	}
	Src.close();
	
}
}
