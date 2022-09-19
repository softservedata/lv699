package com.softserve.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ApplReadNumber {
	public void  readNumber(int start, int end) {
		int [] number =new int [10];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			for(int i=0;i<number.length;i++) {
			System.out.println("Enter your number a"+(i+1)+" :");
			number[i] = Integer.parseInt(br.readLine());
			if(number[i]<=start || number[i]>=end) {
				throw new ArithmeticException();
			}
			}
			System.out.println("Your ten number is "+Arrays.toString(number));
			Arrays.sort(number);//sort array
			int a1=number[0];
			int a2=number[1];
			int a3=number[2];
			int a4=number[3];
			int a5=number[4];
			int a6=number[5];
			int a7=number[6];
			int a8=number[7];
			int a9=number[8];
			int a10=number[9];
			System.out.println("Your numbers in range: "+start+"<"+a1+"<"+a2+"<"+a3+"<"+a4+"<"+a5+"<"+a6+"<"+a7+"<"+a8+"<"+a9+"<"+a10+"<"+end);
		}catch(NumberFormatException | IOException e) {
			System.out.println("NumberFormatException | IOException");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException, please enter numbers ranging from "+start+" to 345"+end);
		}
	}
	
	public static void main(String[] args) {
		ApplReadNumber r= new ApplReadNumber();
		r.readNumber(1,100);
	}
	
}
//Write a method readNumber(int start, int end), 
//that read from console integer number and return it, if it is in the range [start...end]. 
//If an invalid number or non-number text is read, the method should throw an exception. 
//Using this method write a method main(), that has to enter 10 numbers:
//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
//Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
