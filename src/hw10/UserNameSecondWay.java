package hw10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameSecondWay {
    public static void main(String[] args) {
        String[] usernames = {
                "-B",
                "Bond 007",
                "_James_Bond_007",
                "+007",
                "_James_Bond_00007"
        };
        check(usernames);
    }
    public static void check(String[] _usernames) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,15}$");
        Matcher matcher;
        for (String username : _usernames) {
            matcher = pattern.matcher(username);
            System.out.println("Username " + username + ": " + matcher.matches() + ", username length: " + username.length());
        }
    }
}
