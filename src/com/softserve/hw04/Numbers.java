package com.softserve.hw04;
public class Numbers {
	public static void main(String [] args) {
		int [] numbers = {2,5,6};
		int count=0;
			for(int i=0;i<numbers.length;i++) {
				if(numbers[i]%2==0) {
					
					count++;
				}
				
			}
			System.out.println("Quantity of odd= " + count);
}
	}
