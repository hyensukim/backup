package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex12 {

	public static void main(String[] args) {
		String strDate = "2021/11/20 21:30:00";
		String pattern = "yyyy/MM/dd HH:mm:ss";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime ldt = LocalDateTime.parse(strDate,dtf);
		System.out.println(ldt);
		
	}

}
