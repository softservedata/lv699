package com.softserve.HomeWork.hw05;
import java.util.Scanner;


/*Ask user to enter the number of month. Read the value and write the number of
        days in this month (create array with amount days of each month).*/

public class HwFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the month");
        int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        switch (scanner.nextInt()){
            case 1:
                System.out.println("you entered the month is January. January has " + daysInMonth[0] + " days");
                break;
            case 2:
                System.out.println("you entered the month is February. February has " + daysInMonth[1] + " days");
                break;
            case 3:
                System.out.println("you entered the month is March. March has " + daysInMonth[2] + " days");
                break;
            case 4:
                System.out.println("you entered the month is April. April has " + daysInMonth[3] + " days");
                break;
            case 5:
                System.out.println("you entered the month is May. May has " + daysInMonth[4] + " days");
                break;
            case 6:
                System.out.println("you entered the month is June. June has " + daysInMonth[5] + " days");
                break;
            case 7:
                System.out.println("you entered the month is July. July has " + daysInMonth[6] + " days");
                break;
            case 8:
                System.out.println("you entered the month is August. August has " + daysInMonth[7] + " days");
                break;
            case 9:
                System.out.println("you entered the month is September. September has " + daysInMonth[8] + " days");
                break;
            case 10:
                System.out.println("you entered the month is October. October has " + daysInMonth[9] + " days");
                break;
            case 11:
                System.out.println("you entered the month is November. November has " + daysInMonth[10] + " days");
                break;
            case 12:
                System.out.println("you entered the month is December. December has " + daysInMonth[11] + " days");
                break;
            default:
                System.out.println("enter an integer from 1 to 12");
                break;
        }
        scanner.close();
    }
}