package com.tyss.org.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class DateClass {
	public static void main(String[] args) {
		Date d = new Date();
		log.info("date : " + d);

		LocalDate date = LocalDate.now();
		log.info(" local date:  " + date.getDayOfMonth() + " getDayOfYear" + date.getDayOfYear() + " getMonthValue"
				+ date.getMonthValue() + " getEra" + date.getEra() + " toEpochDay" + date.toEpochDay());

		LocalDateTime ldt = LocalDateTime.of(1995, 07, 29, 4, 30);
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(" DOB:  " + ldt);
		System.out.println(ldt1.getYear() - ldt.getYear() + ": years");

		Period period = Period.between(date.now(), date.now().withYear(1995).withMonth(07).withDayOfMonth(27));
		System.out.println("period--  " + period);
		LocalTime lt = LocalTime.now().NOON;
		log.info("-----------------" + lt);

		log.info("local date time: " + ldt);

		long start = System.nanoTime();
		// ...
		long finish = System.nanoTime();

		long timeElapsed = finish - start;
		log.info("local date time start: " + start);
		log.info("local date time finish: " + finish);
		log.info("local date time: " + timeElapsed);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss.S aa");
		String formattedDate = dateFormat.format(new Date()).toString();
		System.out.println(formattedDate);
		log.info("dateFormat: " + dateFormat);

	}
}
