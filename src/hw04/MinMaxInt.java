package hw04;

import java.util.Scanner;

public class MinMaxInt {
    public static void main(String[] args) {
        int n1, n2, n3;
        MinMaxInt minMaxInt = new MinMaxInt();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1:");
        n1 = scanner.nextInt();

        System.out.println("Enter number 2:");
        n2 = scanner.nextInt();

        System.out.println("Enter number 3:");
        n3 = scanner.nextInt();

        System.out.println(minMaxInt.findMaxMinInt(n1, n2, n3));
    }

    public String findMaxMinInt(int n1, int n2, int n3) {
        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }

        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        return "Max = " + max + ", Min = " + min;
    }
}
