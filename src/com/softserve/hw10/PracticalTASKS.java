package com.softserve.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTASKS {
    public static void main(String[] args) {

        //task1
        String s1 = new String("Java have javac");
        String s2 = new String("javac");
        System.out.println("Is it true that s1 contains s2? - " + "Yes, it's " + s1.contains(s2));

        //task2
     /* Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
surnames and initials
*/
String myName = "Ivanov Ivan Ivanovych";

String p = "[A-Z]\\w*\\s{1}[A-Z]";
Pattern comp = Pattern.compile(p);
Matcher m = comp.matcher(myName);
m.reset();
        while (m.find()) {
            System.out.println("Surname and first letter of name: " + myName.substring(m.start(), m.end()));
            }
        m.reset();

        // name
        String pattern2 = "\\s{1}\\w*\\s{1}";
        Pattern c = Pattern.compile(pattern2);
        Matcher m2 = c.matcher(myName);

        while (m2.find()) {
            System.out.println("Name: " + myName.substring(m2.start()+1, m2.end()-1));
        }
        m2.reset();

        //name, middle name and last name
        String pattern3 = "\\s{1}[A-Z]\\w*\\s{1}[A-Z]\\w*\\S";
        Pattern c2 = Pattern.compile(pattern3);
        Matcher m3 = c2.matcher(myName);
        String t3 = "";
        while (m3.find()) {
            t3= t3.concat(myName.substring(m3.start()+1, m3.end()));
            t3= t3 + " ";
        }


        m3.reset();

        String pattern4 = "[A-Z]\\w*\\s{1}[A-Z]";
        Pattern comp1 = Pattern.compile(p);
        Matcher m4 = comp1.matcher(myName);
        while (m4.find()) {
            t3 = t3.concat(myName.substring(m4.start(), m4.end()-1));

        }
        m4.reset();
        System.out.println("name, middle lastname: " + t3);

// task 3

        List<String> userName = new ArrayList<>();
        userName.add("First00___ju");
        userName.add("Se");
        userName.add("Third03_");
        userName.add("Fourth__966666667ffgk7_");
        userName.add("Fifth-");

        String pattern6 = "\\b\\w{3,15}\\b";
        Pattern c5 = Pattern.compile(pattern6);
        Matcher m5 = c5.matcher(userName.toString());
        while (m5.find()) {

            System.out.println("Match was found: "+ userName.toString().substring(m5.start(), m5.end()));
        }





    }


}
