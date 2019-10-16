package com;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CopyRight
public class DateTimeAPI {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(formatter.format(date));

		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("the current zone is " + currentZone.getZone());
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
		System.out.println("tokyo time zone is " + tokyoZone);

		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
		Period gap = Period.between(date2, date1);
		System.out.println("gap between dates " + "is a period of " + gap.getMonths());

	}
}
