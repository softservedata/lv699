package HW4;

import java.io.ObjectInputStream.GetField;

public class NumberMinMax {

	public static void main(String[] args) {
		NumberMinMax dif = new NumberMinMax();
		NumberMinMax dif1 = new NumberMinMax();
		System.out.println("Minimal number is " + dif.mini(358900, 70000, 300));
		System.out.println("Maximal number is " + dif1.maxi(400, 70000, 2500000));

	}

	private int num1;
	private int num2;
	private int num3;

	public NumberMinMax() {
	}

	int minimal;
	int maximal;

	public int mini(int num1, int num2, int num3) {
		if (num1 < num2) {
			minimal = num1;
		} else {
			if (num2 < num3) {
				minimal = num2;
			} else {
				if (num3 < num1) {
					minimal = num3;
				} else {
					minimal = num1;
				}
			}
		}
		return minimal;
	}

	public int maxi(int num1, int num2, int num3) {
		if (num1 > num2) {
			maximal = num1;
		} else {
			if (num2 > num3) {
				maximal = num2;
			} else {
				if (num3 > num1) {
					maximal = num3;
				} else {
					maximal = num1;
				}
			}
		}
		return maximal;
	}
}
