package com.softserve.hw13.second;

import java.util.stream.Collectors;

public class AppCrypt {
	public String encrypt(String s, int num) {
        return s.chars() //.forEach(System.out::println);
                .boxed()
                .map(k->String.valueOf(( (char)( (k==122? (97+(num-1)) : ((k + num)>=122 ?97+((num)-(122-k)):k+num) ) ) )))
                        .collect(Collectors.joining(""));
    }
    public String decrypt(String s, int num) {
        return s.chars() //.forEach(System.out::println);
                .boxed()
                .map(k->String.valueOf( (char)(num>0?(k==97? (122+(num-1)) : ((k - num)<97 ?((k-97)>num?122+((k-97)+(num-1)):122-((k-97)+(num-1))):k-num) )
                		:(k==97? (122+(1+num)) : ((k + num)<97 ?((k-97)>num?122+((k-97)+(num+1)):122-((k-97)+(num+1))):k+num) )) ) )
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        String s  = "abcdefghijz";
        int num = 3;
        int num1 = -3;
        AppCrypt app = new AppCrypt();
        System.out.println("origin = " + s);
        System.out.println("encrypt = " + app.encrypt(s, num));
        System.out.println("decrypt = " + app.decrypt(app.encrypt(s, num), num1));
    }
}
//xyzabcdefgw
