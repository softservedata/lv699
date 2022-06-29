package com.softserve.hw03;

import java.util.Scanner; // загружаємо клас сканер

class app03 {
	public static void main(String[]args)
	{

		System.out.println("Для розрахунку вартості дзвінків необхідно ввести тариф і час розмови");

		Scanner scan = new Scanner(System.in);

		System.out.print("Вартість дзвінка для країни с1 в грн/хв_");
		double c1 = scan.nextDouble();
		System.out.print("Час розмови t1 в хв_ ");
		double t1 = scan.nextDouble();

		System.out.print("Вартість дзвінка для країни с2 в грн/хв_");
		double c2 = scan.nextDouble();
		System.out.print("Час розмови t2 в хв_");
		double t2 = scan.nextDouble();
		
		System.out.print("Вартість дзвінка для країни с3 в грн/хв_");
		double c3 = scan.nextDouble();
		System.out.print("Час розмови t3 в хв_");
		double t3 = scan.nextDouble();
		
		System.out.println ("Ви ввели");
		System.out.println("с1=" + c1 + "грн/хв; t1=" + t1 + " хв;");
		System.out.println("с1=" + c2 + "грн/хв; t2=" + t2 + " хв;");
		System.out.println("с1=" + c3 + "грн/хв; t3=" + t3 + " хв;");
	    System.out.println ("Для підтвердження натисніть  Enter");
	    
		double Cost1=c1*t1;
		double Cost2=c2*t2;
		double Cost3=c3*t3;
		double CostTotal=Cost1+Cost2+Cost3;
		
		System.out.println ("Результат:");
		System.out.println("Вартість розмови в країну с1 складає: " + Cost1 + " грн.");
		System.out.println("Вартість розмови в країну с2 складає: " + Cost2 + " грн.");
		System.out.println("Вартість розмови в країну с3 складає: " + Cost3 + " грн.");
		System.out.println ("Загальні витрати на всі розмови склали "+CostTotal+" грн.");
		scan.close();
	}
}