package day16;

import java.time.*;
import java.time.temporal.*;
import static java.time.temporal.ChronoField.*;
import static java.time.temporal.ChronoUnit.*;

public class Ex04 {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
//		int year = ldt.get(YEAR);//ChronoField의 멤버변수 사용
		int year = ldt.getYear();
//		int month = ldt.get(MONTH_OF_YEAR);
		int month = ldt.getMonthValue();
//		int day = ldt.get(DAY_OF_MONTH);
		int day = ldt.getDayOfMonth();
		
		
//		int hours = ldt.get(HOUR_OF_DAY);
		int hours = ldt.getHour();
//		int min = ldt.get(MINUTE_OF_HOUR);
		int min = ldt.getMinute();
//		int sec = ldt.get(SECOND_OF_MINUTE);
		int sec = ldt.getSecond();
		
		System.out.println(year +"-"+ month +"-"+ day + " "+hours + ":"+min+":"+sec);
		
		DayOfWeek dow = ldt.getDayOfWeek();
		int yoil = dow.getValue();
		System.out.println(yoil);
	}

}
