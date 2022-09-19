package com.softserve.hw11.practical_tasks_first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplSquare {
	static int squareRectangle(int a, int b) {
		if(a<0|b<0) {
			throw new ArithmeticException("negative value");
		}
		return a*b;
	}
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
	int a = Integer.parseInt(br.readLine());
	int b = Integer.parseInt(br.readLine());
			System.out.println("Area of squareRectangle= "+squareRectangle(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error Founded = " + e.getMessage());
        }catch (NumberFormatException | IOException e) {
            System.out.println("Error Founded = " + e.getMessage());
        }
		
		
	}

}
