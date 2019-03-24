package com.java.programs;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateComparision {

	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String stringDeadlineDateTime = "08-03-2019 12:00";
		
		LocalDateTime currentDateTime = LocalDateTime.parse(LocalDateTime.now().atZone(ZoneId.of("America/New_York")).
				format(dateTimeFormat), dateTimeFormat);
		//LocalDateTime currentDateTime1 = LocalDateTime.parse(LocalDateTime.now().format(dateTimeFormat), dateTimeFormat);
		LocalDateTime deadlineDateTime = LocalDateTime.parse(stringDeadlineDateTime, dateTimeFormat);
		
		System.out.println("Current Date Time: "+currentDateTime);
		System.out.println("Deadline Date: "+deadlineDateTime);
		System.out.println("Duration: "+Duration.between(currentDateTime, deadlineDateTime).toMinutes());

	}

}
