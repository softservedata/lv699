package Homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.*;
public class Task2 { public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Hello. What is your name?");
    String name = br.readLine();
    System.out.println("Where are you live?");
    String city = br.readLine();

    System.out.println("Hello " + name);
    System.out.println("You are live in " + city);
}
}
