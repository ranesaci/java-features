//replacement of legacy TimeZone and GregorianCalendar as it is too much verbose to use

package com.sachin4java.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class Time {

	public static void main(String[] args) {
		
		//current date
		LocalDate localDate = LocalDate.now();
		System.out.println("current date="+localDate);
		
		//create custom date 1 Jun 1987
		LocalDate customDate = LocalDate.of(1987, Month.JUNE, 1);
		System.out.println("customDate ="+customDate);

		//current date by zone
		LocalTime zoneTimeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		LocalTime zoneTimeBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
		
		System.out.println("zoneTimeKolkata="+zoneTimeKolkata);
		System.out.println("zoneTimeBerlin="+zoneTimeBerlin);

		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime="+localDateTime);
		
		//create custom date 1 Jun 1987
		LocalDateTime customDateTime = LocalDateTime.of(1987, Month.JUNE, 1, 05,30,00);
		System.out.println("customDate ="+customDateTime);

		//current date by zone
		LocalDateTime zoneDateTimeKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		LocalDateTime zoneDateTimeBerlin = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		
		System.out.println("zoneDateTimeKolkata="+zoneDateTimeKolkata);
		System.out.println("zoneDateTimeBerlin="+zoneDateTimeBerlin);
		
		//invalid arguments for creating Date/Time, then it throws java.time.DateTimeException that is a RuntimeException
		
		//current timestamp
		Instant instant = Instant.now();
		System.out.println("instant="+instant);
		
		
		//date api utilities
		LocalDate date = LocalDate.of(1987, Month.JUNE, 1);
		
		System.out.println("Date="+date.getDayOfMonth() + " Month="+date.getMonthValue() + " Year="+date.getYear());
		
		LocalDate plusDays = date.plusDays(10);
		System.out.println("adding 10 days to date");
		System.out.println("Date="+plusDays.getDayOfMonth() + " Month="+plusDays.getMonthValue() + " Year="+plusDays.getYear());
		
		LocalDate plusMonths =date.plusMonths(1);
		System.out.println("adding 1 month to date");
		System.out.println("Date="+plusMonths.getDayOfMonth() + " Month="+plusMonths.getMonthValue() + " Year="+plusMonths.getYear());
		
		LocalDate plusWeeks =date.plusWeeks(2);
		System.out.println("adding 2 weeks to date");
		System.out.println("Date="+plusWeeks.getDayOfMonth() + " Month="+plusWeeks.getMonthValue() + " Year="+plusWeeks.getYear());
		
		LocalDate plusYears =date.plusYears(1);
		System.out.println("adding 1 year to date");
		System.out.println("Date="+plusYears.getDayOfMonth() + " Month="+plusYears.getMonthValue() + " Year="+plusYears.getYear());
		
	}
}
