package hw10;

import java.util.regex.Pattern;

public class FullName {
    public static void main(String[] args) {
        String fullName = "Peter Johnson While";

        Pattern pattern = Pattern.compile("\\s");

        String[] str = pattern.split(fullName, 3);

        System.out.println("Surnames and initials: " + str[2] + " " + str[0].charAt(0) + ". " + str[1].charAt(0) + "." +
                "\nName: " + str[0] +
                "\nName, Middle name and Last name: " + str[0] + ", " + str[1] + " " + str[2]);
    }
}
