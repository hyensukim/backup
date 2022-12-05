package day16;

import java.time.*;
import static java.time.temporal.ChronoField.*;

public class Ex05 {

	public static void main(String[] args) {
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
		
		//기존에 ldt1 값은 안바뀌고 연산된 값은 반환값으로 저장된다.
//		LocalDateTime ldt2 = ldt1.with(YEAR,2023);
		LocalDateTime ldt2 = ldt1.withYear(2023);
		System.out.println(ldt2);
		
	}

}
