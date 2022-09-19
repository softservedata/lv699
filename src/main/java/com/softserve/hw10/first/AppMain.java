package com.softserve.hw10.first;

public class AppMain {
	public static void main(String[] args) {
		Methods methods=new Methods();
		String s="One way or another I'm gonna find ya";
		System.out.println("The longest word in the sentence: "+methods.longest(s));
		System.out.println("Number of letter of this word: "+methods.numberL(s));
		System.out.println("Second word in reverse"+methods.secondWord(s));
	}

}
