package com.softserve.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplDiv {
	public static double div() { // throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("a=");
			double a = Double.parseDouble(br.readLine());
			System.out.print("b=");
			double b = Double.parseDouble(br.readLine());
			return a / b;
		} catch (NumberFormatException | IOException e) {
			System.out.println("NumberFormatException | IOException");
			return -1;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			// System.exit(0);
			return -2;
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("message = " + e.getMessage());
			return -3;
		} 
	}
	
	public static void main(String[] args) {
		System.out.println("The dividing of two numbers"+div());
	}
}
	
