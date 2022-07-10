package HW4;

import java.util.Scanner;

public class FloatReadForCheck {

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	float y = floatReadForChheck();

	public float floatReadForChheck() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number betwen -5.0 and 5.0: ");
		float i = scan.nextFloat();
		if (i >= -5 && i <= 5) {
			System.out.println("You have entered the correct number");
		}
		return floatReadForChheck();
	}
}

