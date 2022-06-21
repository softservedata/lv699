package Homework;
import javafx.scene.shape.Circle;
import java.util.Scanner;

public class Task1 { static Scanner str = new Scanner(System.in);
    public static void main(String[] args) {
        int radius = 3;
        double area = Math.PI * (radius * radius);
        System.out.println("Площа кола: " + area);
        double circumference= Math.PI * 2*radius;
        System.out.println("Периметр кола: " + circumference) ;
    }
}
