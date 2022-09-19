package com.softserve.hw10.third;

import java.util.regex.*;

public class AppPattern {
	public static void main(String[] args) {
//		Implement a pattern for US currency: 
//		the first symbol "$", then any number of digits, 
//		dot and two digits after the dot. 
//		Enter the text from the console that contains several occurrences of US currency. 
//		Display all occurrences on the screen.
		String s= "I paid $1200120.56 You paid more $236 .56 then $100.34 of less $ 236.56";
		String pattern ="\\$(\\d*)(\\.\\d{2})";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(s);
		if(m.matches()) {
			System.out.println("m.matches() OK");
		} else {
			System.out.println("m.matches() FALSE");
		}
		m.reset();
			while(m.find()) {
				System.out.println(s.substring(m.start(), m.end()));
			}
		
	}

}
