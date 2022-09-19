package com.softserve.hw10.first;

public class Methods {

	public String longest (String s) {
		String [] s1=new String[] {};
		s1=s.split(" ");
		int count=0;
		String result="Please enter sentence!";
		for(String compare:s1) {
			if(compare.length()>count) {
				count=compare.length();
				result=compare;
			}
		}
		return result;
	}
	public int numberL (String s) {
		String [] s1=new String[] {};
		s1=s.split(" ");
		int count=0;
		String result="";
		for(String compare:s1) {
			if(compare.length()>count) {
				count=compare.length();
				
			}
			
		}
		return count;
	}
	public String secondWord (String s) {
		String [] s1=new String[] {};
		s1=s.split(" ");
		System.out.println("Word before reverse:"+s1[1]);
		StringBuilder sb = new StringBuilder(s1[1]);
		String result=sb.reverse().toString();
		return "Word after reverse: "+result;
	}

}
