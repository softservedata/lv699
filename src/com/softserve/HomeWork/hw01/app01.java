package com.softserve.HomeWork.hw01;

import java.util.Scanner; // імпорт сканера

import static java.lang.Math.PI;
import static java.lang.Math.pow;

class app01 {
	public static void main(String[] args)
	{

		System.out.println("Для розрахунку площі та периметру клумби необхідно:");
		System.out.println("Ввести радіус клумби та натиснути Enter");
		System.out.print("_");

		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		System.out.println ("Ви ввели радіус  " + r+" см");
		System.out.println(" ");
		
		double P; // оголошуємо змінну
		P=2* PI*r;//вираховуємо периметр кола
		// оголошуємо змінну
		double S = PI * pow(r, 2);//вираховуємо площу кола

		System.out.println ("Перимитр клумби дорівнює "+P+" см");
		System.out.println ("Площа клумби дорівнює "+S+" см");
	}
}
