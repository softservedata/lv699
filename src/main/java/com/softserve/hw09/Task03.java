package com.softserve.hw09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task03 {

    public static void main(String[] args) {
        String pattern = "\\$\\s*\\d+\\.\\d{2}";
        String text = "Now is the time. 4 item(s) - $ 1111450.40 text. 222.33E text $110.41 text.";
        //
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            String dollar = text.substring(m.start() + 1, m.end()).trim();
            System.out.println("dollar = " + dollar);
        }
    }
}
