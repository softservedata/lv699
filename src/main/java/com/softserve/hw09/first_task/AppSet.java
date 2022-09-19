package com.softserve.hw09.first_task;
import java.util.*;

public class AppSet {
	public static void main(String[] args) {
		
		Set<String> names1 = new HashSet<>();
		names1.add("Mike");
		names1.add("Nick");
		names1.add("Sara");
		Set<String> names2 = new HashSet<>();
		names2.add("Mike");
		names2.add("Stiven");
		names2.add("John");
		System.out.println(Method.union(names1, names2));
		System.out.println(Method.intersect(names1, names2));
		
	}

}
