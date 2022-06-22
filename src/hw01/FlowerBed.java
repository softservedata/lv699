package hw01;

import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {
        FlowerBed flowerBed = new FlowerBed();
        flowerBed.calcAreaAndPerimeter();
    }
    public void calcAreaAndPerimeter() {
        int r;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        r = scan.nextInt();
        System.out.println("Radius: " + r);

        double perimeter = 2 * Math.PI *r;
        System.out.print("Perimeter = ");
        System.out.format("%.2f", perimeter);

        double area = Math.PI * Math.pow(r, 2);
        System.out.print("\n\rArea = ");
        System.out.format("%.2f", area);

        scan.close();
    }
}
