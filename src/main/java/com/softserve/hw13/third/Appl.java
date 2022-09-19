package com.softserve.hw13.third;
//Create method to validate date according to format "mm.dd.yy"

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Appl {
	static String compare() {
		System.out.println("Enter date please in format : mm.dd.yy: ");
		String s = Src.scannerS();
		LocalDateTime localDate = new Date(System.currentTimeMillis()).toInstant().atZone(ZoneId.systemDefault())
				.toLocalDateTime();
		// LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
		System.out.println("localDate.format(formatter): " + localDate.format(formatter));
		if (localDate.format(formatter).equals(s)) {
			return true+"";
		}
		return false + "";
	}

	public static void main(String[] args) {
		System.out.println("Now we check if your date corresponds to today's time. And the result is: " + compare());
	}

}
