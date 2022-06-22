package hw01;

import java.util.Scanner;

public class Calc
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;

        System.out.println("Enter integers a: ");
        a = scan.nextDouble();

        System.out.println("Enter integers b: ");
        b = scan.nextDouble();

        double addition = a + b;
        System.out.print("a + b = ");
        System.out.format("%.0f", addition);

        double subtraction = a - b;
        System.out.print("\n\ra - b = ");
        System.out.format("%.0f", subtraction);

        double multiply = a * b;
        System.out.print("\n\ra * b = ");
        System.out.format("%.0f", multiply);

        double division = a / b;
        System.out.print("\n\ra / b = ");
        System.out.format("%.3f", division);

        scan.close();
    }
}
