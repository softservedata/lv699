package hw04;

import java.util.Scanner;

public class NumberDay {
    public static void main(String[] args) {
        int answerDay;
        NameDay nameDay;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of the day of the week: ");
        answerDay = scan.nextInt();

        switch (answerDay) {
            case 1:
                nameDay = NameDay.day1;
                System.out.print(nameDay);
                break;
            case 2:
                nameDay = NameDay.day2;
                System.out.print(nameDay);
                break;
            case 3:
                nameDay = NameDay.day3;
                System.out.print(nameDay);
                break;
            case 4:
                nameDay = NameDay.day4;
                System.out.print(nameDay);
                break;
            case 5:
                nameDay = NameDay.day5;
                System.out.print(nameDay);
                break;
            case 6:
                nameDay = NameDay.day6;
                System.out.print(nameDay);
                break;
            case 7:
                nameDay = NameDay.day7;
                System.out.print(nameDay);
                break;
            default:
                System.out.println("Please enter the day number, example: 1 or 7");
        }
    }

    enum NameDay {
        day1("Monday", "Понеділок", "Poniedziałek"), day2("Tuesday", "Вівторок", "wtorek"),
        day3("Wednesday", "Середа", "Środa"), day4("Thursday", "Четверг", "Czwartek"),
        day5("Friday", "П'ятниця", "Piątek"), day6("Saturday", "Субота", "Sobota"),
        day7("Sunday", "Неділя", "Niedziela");

        private final String en, ua, pl;

        NameDay(String en, String ua, String pl) {
            this.en = en;
            this.ua = ua;
            this.pl = pl;
        }

        public String getEn() {
            return en;
        }

        public String getUa() {
            return ua;
        }

        public String getPl() {
            return pl;
        }

        @Override
        public String toString() {
            return getEn() + "\n" + getUa() + "\n" + getPl();
        }
    }
}
