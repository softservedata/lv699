package hw5;

import java.util.Scanner;


public class Car {
	private String type;
	private int yearProduction;
	private double vengine;

	public int getYearProduction() {
		return yearProduction;
	}

	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearProduction=" + yearProduction + ", vengine=" + vengine + "]";
	}

	public Car() {
	}

	public Car(String type, int yearProduction, double engineV) {
		this.type = type;
		this.yearProduction = yearProduction;
		this.vengine = engineV;
	}

	private int yearProduction() {
		return 0;
	}

	public static void main(String[] args) {

		Car[] auto = new Car[4];
		auto[0] = new Car("petrol", 2001, 2.5);
		auto[1] = new Car("petrol", 2003, 2.0);
		auto[2] = new Car("petrol", 2005, 1.9);
		auto[3] = new Car("petrol", 2006, 1.5);
		System.out.println("Please enter year of production");
		Scanner sc = new Scanner(System.in);
		int yearProd = sc.nextInt();
		sc.close();

		Car automotive = new Car();
		for (int i = 0; i < auto.length; i++) {
			if (yearProd == auto[i].getYearProduction()) {
				System.out.println("which of the four cars suits you best " + auto[i]);
			}
		}
	}
}