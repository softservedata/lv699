package hw04;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        float n1, n2, n3;
        NumberInRange numberInRange = new NumberInRange();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number one: ");
        n1 = scan.nextFloat();
        System.out.println(numberInRange.findTheRange(n1));

        System.out.print("Enter number two: ");
        n2 = scan.nextFloat();
        System.out.println(numberInRange.findTheRange(n2));

        System.out.print("Enter number three: ");
        n3 = scan.nextFloat();
        System.out.println(numberInRange.findTheRange(n3));
    }
    public String findTheRange(float n) {
        if (n >= -5 && n <= 5) {
            return n + " belong to the range [-5,5]";
        } else {
            return n + " not belong to the range [-5,5]";
        }
    }
}
