package hw10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternOfUSCurrency {
    public static void main(String[] args) {
        String[] amounts = {
                "$12.15",
                "125.14",
                "$67.9",
                "$41366817864325.12"
        };
        Pattern pattern = Pattern.compile("\\$[0-9]+\\.[0-9]{2}");
        Matcher matcher;
        for (String amount : amounts) {
            matcher = pattern.matcher(amount);
            if (matcher.find()) {
                System.out.println(amount.substring(matcher.start(), matcher.end()).trim() + " ");
            }
        }
    }
}
