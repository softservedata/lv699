/*Ask user to enter the number of month.
Read the value and write the number of days in this month (create array with amount days of each month).
 */
package hw1;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 31, 30, 31, 30};

        System.out.println("\n //Press 0 to exit the program//\n Enter the number of month: ");
        int month = sc.nextInt();


        switch (month) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                System.out.println("There are " + days[0] + " days inn the 1st month!");
                break;
            case 2:
                System.out.println("There are " + days[1] + " days inn the 2nd month!");
                break;
            case 3:
                System.out.println("There are " + days[2] + " days inn the 3rd month!");
                break;
            case 4:
                System.out.println("There are " + days[3] + " days inn the 4th month!");
                break;
            case 5:
                System.out.println("There are " + days[4] + " days inn the 5th month!");
                break;
            case 6:
                System.out.println("There are " + days[5] + " days inn the 6th month!");
                break;
            case 7:
                System.out.println("There are " + days[6] + " days inn the 7th month!");
                break;
            case 8:
                System.out.println("There are " + days[7] + " days inn the 8th month!");
                break;
            case 9:
                System.out.println("There are " + days[8] + " days inn the 9th month!");
                break;
            case 10:
                System.out.println("There are " + days[9] + " days inn the 10st month!");
                break;
            case 11:
                System.out.println("There are " + days[10] + " days inn the 11st month!");
                break;
            case 12:
                System.out.println("There are " + days[11] + " days inn the 12st month!");
                break;
            default:
                System.out.println("There are no such month! PLEASE, input numbers from 1 to 12");
                break;


        }


    }
}
