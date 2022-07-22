package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Month {

	public static void main(String[] args) {

// 1. Ask user to enter the number of month. Read the value and write the number of days in this month (create array with amount days of each month).		
		int[] mounthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int numberOfMounth = -1;
		System.out.println("Number of mounth = ");
		Scanner sc = new Scanner(System.in);
		numberOfMounth = sc.nextInt();
		int g = numberOfMounth - 1;
		System.out.println("Hello, you inputed " + numberOfMounth + ". This Mounth has " + mounthDays[g] + " days");

//	2. Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.	

		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = -1;
		}
		int n = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print("Please enter 10 number for add to array ");
			n = (sc.nextInt());
			if (n < 0) {
				break;
			}
			num[i] = n;
		}
		System.out.println("Array num " + Arrays.toString(num));
		
// sum of first 5 elements
		int sumF = 0;
		for (int i = 0; i < num.length; i++) {
			if (i >= 5) {
				break;
			}
			sumF += num[i];
		}
		System.out.println("Total summ the first five number = " + sumF);
		
// Product of last 5 elements
		int Product = 1;
		for (int i = 5; i < num.length; i++) {
			Product = Product * num[i];
		}
		System.out.println("Product the last five number = " + Product);

// Enter 5 integer numbers. Find  position of second positive number;

		int[] fiveNumber = new int[5];
		for (int i = 0; i < fiveNumber.length; i++) {
			System.out.print("\nPlease enter 5 number for add to array ");
			fiveNumber[i] = (sc.nextInt());
		}
		System.out.println("Array fiveNumber " + Arrays.toString(fiveNumber));
		sc.close();
		for (int i = 0; i < fiveNumber.length; i++) {
			if (fiveNumber[i] > 0) {
			}
			if (fiveNumber[i] > 0) {
				int positionInArray = i + 1;
				System.out.println(fiveNumber[i] + " - this number in array on " + positionInArray + " position");

// minimum and its position in the array
				int min = fiveNumber[0];
				int imin = 0;
				while (i < fiveNumber.length) {
					if (fiveNumber[i] < min) {
						min = fiveNumber[i];
						imin = i;
					}
					i++;
				}
				System.out.println("Minimum number = " + min + ". Position in array " + (imin + 1));
			}

// Count the product of all entered even numbers
			int productall = 1;
			for (int h = 0; h < fiveNumber.length; h++) {

				if (fiveNumber[h] != 0) {
					if (fiveNumber[h] % 2 == 0) {
						productall = productall * fiveNumber[h];
					}
				}
			}
			System.out.println("Product of numbers = " + productall);
		}

	}
}
