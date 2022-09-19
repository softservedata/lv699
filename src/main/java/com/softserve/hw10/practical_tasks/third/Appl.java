package com.softserve.hw10.practical_tasks.third;

import java.util.*;
import java.util.regex.*;

public class Appl {
//	The user name can be 3 to 15 characters of the Latin alphabet, 
//	numbers, and underscores. Using regular expressions implement checking the user name for validity. 
//	Input five names in the main method . 
//	Output a message to the console of the validation of each of the entered names.
public static void main(String[] args) {
	String pattern ="^[a-zA-Z0-9_-]{3,15}$";
	List<String> names = new ArrayList<>();
	names.add("Maksym");
	names.add("Oleh_5");
	names.add("Oli4ka");
	names.add("Go");
	names.add("Salihamidshynch4");
	//
	for(String text:names) {

	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(text);
	//
	// 1. Is correspond
	if (m.matches()) {
		System.out.println("validation of name "+text+" is OK");
	} else {
		System.out.println("validation of name "+text+" is FALSE");
	}
	}
}
}
