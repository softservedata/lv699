package com.softserve.hw10.second;
public class ApplMain {
public static void main(String[] args) {
	String s="  I  am  learning  Java  Core  ";
	System.out.println("Sentence: \n"+s);
	System.out.println("Sentence after convert spaces to one:\n"+s.replaceAll(" +", " ").trim());
}
}
