package day16;

import java.time.*;
import java.time.format.*;

public class Ex11 {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		String pattern = "yyyy-MM-dd a hh:mm:ss E";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String strDate1 = dtf.format(ldt);
		System.out.println(strDate1);
		
	}

}
