package com.softserve.hw09.first_task;

import java.util.*;


public class Method {
	public static <T> Set<T>  union(Set<T> set1, Set<T> set2){
		Set<T> names=new HashSet<>();
		names.addAll(set1);
		names.addAll(set2);
		return names;
	}
	public static <T> Set<T>  intersect(Set<T> set1, Set<T> set2){
		set1. retainAll(set2);
		return set1;
	}
}
