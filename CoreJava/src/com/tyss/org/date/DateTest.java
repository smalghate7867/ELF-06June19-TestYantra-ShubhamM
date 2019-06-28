package com.tyss.org.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTest {
	public static void main(String[] args) {
		LocalDate birth = LocalDate.of(1995, 11, 19);
		LocalDate dead = birth.plusYears(60);
		Period period = Period.between(birth, dead);

		System.out.println(period);
		
		ZoneId z=ZoneId.systemDefault();
		ZoneId zz=ZoneId.of("Asia/Calcutta");
		ZonedDateTime x1=ZonedDateTime.now(zz);
		System.out.println("INDIAN : "+x1);
		
		ZoneId zid=ZoneId.of("Australia/Sydney");
		ZonedDateTime x=ZonedDateTime.now(zid);
		System.out.println(x);
	}
}
