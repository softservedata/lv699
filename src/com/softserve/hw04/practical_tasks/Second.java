package com.softserve.hw04.practical_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose day of the week. Write in number.");
        String input = br.readLine();
        switch (input) {
            case "1":
                System.out.println("Понеділок, Monday, Lunedì");
                break;
            case "2":
                System.out.println("Вівторок, Tuesday, Martedì");
                break;
            case "3":
                System.out.println("Середа, Thursday, Mercoledì");
                 break;
            case "4":
                System.out.println("Четвер, Wednesday, Giovedì");
                 break;
            case "5":
                System.out.println("Пятниця, Friday, Venerdì");
                 break;
            case "6":
                System.out.println("Субота, Saturday, Sabato");
                break;
            case "7":
                System.out.println("Неділя, Sunday, Domenica");
                break;
            default:
                System.out.println("Wrong number");
                //   System.exit(0);
        }


    }
}
