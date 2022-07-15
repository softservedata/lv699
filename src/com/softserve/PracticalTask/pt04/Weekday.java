package com.softserve.PracticalTask.pt04;

import java.util.Scanner;

    public class Weekday {


        public static void main(String[] args) {
            int answerDay;
            Weekday.NumberDay numberDay;

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of the day of the week: ");
            answerDay = scan.nextInt();

            switch (answerDay) {
                case 1:
                    numberDay = Weekday.NumberDay.day1;
                    System.out.print(numberDay);
                    break;
                case 2:
                    numberDay = Weekday.NumberDay.day2;
                    System.out.print(numberDay);
                    break;
                case 3:
                    numberDay = Weekday.NumberDay.day3;
                    System.out.print(numberDay);
                    break;
                case 4:
                    numberDay = Weekday.NumberDay.day4;
                    System.out.print(numberDay);
                    break;
                case 5:
                    numberDay = Weekday.NumberDay.day5;
                    System.out.print(numberDay);
                    break;
                case 6:
                    numberDay = Weekday.NumberDay.day6;
                    System.out.print(numberDay);
                    break;
                case 7:
                    numberDay = Weekday.NumberDay.day7;
                    System.out.print(numberDay);
                    break;
                default:
                    System.out.println("Please enter the week day:");
            }
        }

        enum NumberDay {
            day1("Понеділок", "Monday", "Montag"), day2("Вівторок", "Tuesday", "Dienstag"),
            day3("Середа", "Wednesday", "Mittwoch"), day4("Четвер", "Thursday", "Donnerstag"),
            day5("Пятниця", "Friday", "Freitag"), day6("Субота", "Saturday", "Samstag"),
            day7("Неділя", "Sunday", "Sonntag");
            private final String ua, en, de;

            NumberDay() {
                this.ua = " ";
                this.en = " ";
                this.de = " ";
            }
            NumberDay(String ua, String en, String de) {
                this.ua = ua;
                this.en = en;
                this.de = de;
            }

            public String getUa() {
                return ua;
            }

            public String getEn() {
                return en;
            }

            public String getDe() {
                return de;
            }

            @Override
            public String toString() {
                return getUa() + "\n" + getEn() + "\n" + getDe();
            }
        }
    }


