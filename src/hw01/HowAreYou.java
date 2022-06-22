package hw01;

import java.util.Scanner;

public class HowAreYou
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How are you? ");
        String answer = scan.nextLine();
        System.out.println("You are: " + answer);

        scan.close();
    }
}
