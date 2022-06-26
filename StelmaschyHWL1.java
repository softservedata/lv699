package h1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class H1 {

	public static void main(String[] args) {

		int radius = 10;
		System.out.println("Площа кола дорівнює = " +  (Math.PI * Math.pow(radius, 2)) + "  м2");
		System.out.println("Периметр кола складає = " + (2 * Math.PI * radius) + "  м");
//
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nБудь-ласка введіть Ваше імя");
		String name = scan.nextLine();
		System.out.println(name + " будь-ласка введіть адресу проживання: ");
		String adress = scan.nextLine();
		System.out.println("Приємно познайомитись " +name+ "." + "Я зрозумів що ви проживаєте за адресою вул. " + adress + ".");
//
		String[] oblast = { "Київ", "Львів", "Житомир" };
		int[] t = { 5, 10, 15 };
		int allminutes = Arrays.stream(t).sum(); //	Аналог решения: int allminutes = t[0] + t[1] + t[2];
		System.out.println("\nЗагальна кількість хвилин в розмовах з містами " + oblast[0] + ", " + oblast[1] + " та "
				+ oblast[2] + " складає  " + allminutes + " хв.");
		

	}

}
