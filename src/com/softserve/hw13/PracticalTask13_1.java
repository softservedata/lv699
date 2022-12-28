package com.softserve.hw13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class PracticalTask13_1 {
    public static void main(String[] args) {


        //Print n random numbers on console using Java 8
        //Print then random numbers on console using Java 8 in a sorted order

        List<Integer> list = new Random().ints()
                .limit(20)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        list.forEach(System.out::println);

/*

        //Using Java 8 show biggest number from n random numbers
        //List<Integer> list2 = Arrays.asList(3,5,666,4,8,14,12,5,8);
        List<Integer> list2 = new Random().ints()
                .limit(20)
                .sorted()
                .boxed()
                .collect(Collectors.toList());
               IntSummaryStatistics statistics = list2.stream()
                  .mapToInt(x->Integer.valueOf(x))
                  .summaryStatistics();

                        list2.forEach(System.out::println);
                   System.out.println(list2);
      System.out.println("biggest number: "+ statistics.getMax());
    }
   */
        //Write a method for sorting list of Strings using Java 8

        List<String> strList = Arrays.asList("Tuesday", " ", "Thursday", "Monday", "Thursday", "Friday", " ", "Saturday", "Sunday", "Wednesday");
        List<String> weekDays = strList.stream()
                .filter(string -> string != " ")
                .distinct()
                .sorted(Comparator.<String, String> comparing (x->x, (e1,e2) -> e1.length() - e2.length())
                        .thenComparing((e1,e2) ->e1.compareTo(e2)))
                .collect(Collectors.toList());
       System.out.println(weekDays);

        //Show which today is a day of a week

        LocalDate currentDate = LocalDate.now();
        DayOfWeek weekDay = currentDate.getDayOfWeek();
        System.out.println("Today is " + weekDay);

        //Show a date of first Monday for current month

        LocalDate currentDate2 = LocalDate.now();
        LocalDate currentDate3 = LocalDate.of(currentDate2.getYear(),currentDate2.getMonth(),1);
        System.out.println(currentDate2.getYear()+ "/"+ currentDate2.getMonth() + "/"+ currentDate2.getDayOfMonth());


        for (int i=0; i<currentDate3.lengthOfMonth(); i++) {
            if ("Monday".equalsIgnoreCase(currentDate3.getDayOfWeek().toString())) {
                break;
            } else {
                currentDate3 = currentDate3.plusDays(1);
            }
        }

System.out.println(currentDate3.getDayOfMonth());

//#2
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        while ( localDate.getDayOfWeek().toString() != "MONDAY") {
            localDate = localDate.plusDays(1);
            }
int firstMonday = localDate.getDayOfMonth();
        System.out.println(firstMonday);
    }





}


