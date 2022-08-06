package hw4;

import java.util.Scanner;

public class FloatReadForCheck {
	private static Scanner scan = new Scanner(System.in);

	public float getY() {
		return y;
	}

	public static void closeScan() {
		if (scan != null) {
			scan.close();
			scan = null;
		}
	}

	private float y = floatReadForChheck();

	public float floatReadForChheck() {
		float i = 0;
//		System.out.println("Please enter number betwen -5.0 and 5.0: ");
//		float i = scan.nextFloat();
//		if (i >= -5.0 && i <= 5.0) {
//			System.out.println("You entered the correct number");
//		} else {
//			System.out.println("It is not correct number. It is out of diapason, please try again ");
//		}
		do {
			System.out.println("Please enter number betwen -5.0 and 5.0: ");
			i = scan.nextFloat();
		} while (i <= -5.0 || i >= 5.0);
		
		return i;
	}
}
