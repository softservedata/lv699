package hw4;

import java.util.Scanner;

public class FloatReadForCheck {

	public float getY() {
		return y;
	}

	private float y = floatReadForChheck();

	public float floatReadForChheck() {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter number betwen -5.0 and 5.0: ");
		float i = scan.nextFloat();
		if (i <= -5 && i <= 5) {
			System.out.println("You entered the correct number");
		} else {
			if (i <= -6 || i >= 6)
				System.out.println("It is not correct number. It is out of diapason, please try again ");		
		}
		return floatReadForChheck();
	}
}

