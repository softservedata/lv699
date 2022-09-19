package hw10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameFirstWay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
        Matcher matcher;

        do {
            System.out.print("Enter username: ");
            userName = scan.nextLine();
            matcher = pattern.matcher(userName);
        } while (!matcher.matches());

        System.out.println("Your username: " + userName);
    }
}
