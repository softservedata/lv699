package com.softserve.hw13.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Appl {
	public static List<String> sort(List<String> strings) {
		Stream<String> st = strings.stream()
				.filter(string -> !string.isEmpty())
			.sorted((p1, p2) -> -p1.length() + p2.length())
			.sorted(Comparator.<String, String>comparing(x -> x, (p1, p2) -> p1.length() - p2.length())
					.thenComparing((p1, p2) -> p1.compareTo(p2)));
		List<String> sortedstrings=	st.map(str->str)
		.collect(Collectors.toList());
		//	.collect(Collectors.toList());
		return sortedstrings;
	}
	
	public static void main(String[] args) {
		//Print n random numbers on console using Java 8
	int n=5;
		Random random = new Random();
		System.out.println(n+" random nubers: ");
		random.ints().limit(n).forEach(System.out::println);
		//Print n random numbers on console using Java 8 in a sorted order
		System.out.println("\nSorted random nubers: ");
		Random random1 = new Random();
		random1.ints().limit(n).sorted().forEach(System.out::println);
		//Using Java 8 show the biggest number from n random numbers
		System.out.printf("\nbiggest number from n random numbers: ");
		//Random random2 = new Random();
		int max=random1.ints().limit(n).sorted().max().getAsInt();
		System.out.println(max);
		//Show which today is a day of a week
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("\nToday is a "+currentTime.getDayOfWeek());
		//Show a date of first Monday for current month
		LocalDate now = LocalDate.now(); //2015-11-23
		LocalDate firstMonday = now.with(firstInMonth(DayOfWeek.MONDAY)); //2015-11-02 (Monday)
		System.out.println("\nDate of first Monday for current month is: "+firstMonday);
		//Write a method for sorting list of Strings using Java 8
		List<String> strings = Arrays.asList("ryfdff", "", "ergd", "dfgdfg", "1", "k34", "abcd123", "ad*");
		System.out.println("\nOriginal: "+strings);
		System.out.println("Sorted: "+Appl.sort(strings));
	}
}
