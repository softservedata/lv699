package hw05;

import java.util.Scanner;

public class DaysInThisMonth {
    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number of month: \n>");
        int numberMonth = scan.nextInt();


        DaysInThisMonth answer = new DaysInThisMonth();
        System.out.println("Number of month: "+ numberMonth+ ", " +
                answer.getQuantityDays(numberMonth, monthDays) + " days");
    }

    public int getQuantityDays(int numberMonth, int[] array) {
        return array[numberMonth - 1];
    }
}
