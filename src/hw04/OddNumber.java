package hw04;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        int number01, number02, number03;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        number01 = scan.nextInt();
        number02 = scan.nextInt();
        number03 = scan.nextInt();

        if (number01 % 2 != 0) {
            count++;
        }
        if (number02 % 2 != 0) {
            count++;
        }
        if (number03 % 2 != 0) {
            count++;
        }
        if (count == 0) {
            System.out.println("There are no odd numbers!");
        } else {
            System.out.println("Number of odd numbers: " + count);
        }
    }
}
