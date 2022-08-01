package pract_task_2;

import java.util.Scanner;

public class CheckDay {


//    String name;
//    private enum DayOfWeek{
//        MONDAY { public void Day(){ System.out.println("Monday"); }},
//        TUESDAY { public void Day(){ System.out.println("Tuesday"); }},
//        WEDNESDAY { public void Day(){ System.out.println("Wednesday"); }},
//        THURSDAY { public void Day(){ System.out.println("Thursday"); }},
//        FRIDAY { public void Day(){ System.out.println("Friday"); }},
//        SATURDAY { public void Day(){ System.out.println("Saturday"); }},
//        SUNDAY { public void Day(){ System.out.println("Sunday"); }}
//    }

    public void checkEng(){
//        DayOfWeek day;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of the day from 1 to 7 to see the day, press 0 to exit: ");
        int ans = scan.nextInt();

        switch (ans){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            case 0:
                break;

            default:
                System.out.printf("Please, input numbers from 1 to 7");
                break;
        }



    }






}

