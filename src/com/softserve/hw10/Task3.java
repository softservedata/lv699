package com.softserve.hw10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String pattern = "\\$\\s*\\d+\\.\\d{2}";
        String t = "$ 5555.95 _ $9999999.55 __ $    65.80%   $100056.96%  === $10000.9";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(t);
        while (m.find()) {
            String occurrences = t.substring(m.start() + 1, m.end()).trim();
            System.out.println("occurences = " + occurrences);

        }
    }
}
