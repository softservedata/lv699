package com.softserve.hw13.first;

import java.util.*;
import java.util.stream.Collectors;

public class Appl {
public static void main(String[] args) {
//	There is a list of strings list1. 
//	Create a new list list2 that has items from 
	//list1 and length less than 5 characters (use method removeIf)
	List<String> strings = Arrays.asList("568ww", "", "bcght", "abcd", "1", "jkl", "abcdwqe", "adqweqwe*");
	System.out.println("List1 : "+strings);
	List<String> filtered =new ArrayList(strings);
	filtered.removeIf(s-> (s.length()>=5));
	System.out.println("List2 : "+filtered);
}
}
