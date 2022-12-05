package day16;

import java.time.*;

public class Ex01 {
	//time 패키지 복습
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		//System.out.println(ld);
		//System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.of(2022,11,10,12,30,20);//자바 time 패키지는 월 단위가 1~12라서 안헤깔린다.
		System.out.println(ldt);
		LocalDateTime ldt2 = LocalDateTime.of(ld, lt);
		System.out.println(ldt2);
		
		
		
	}

}
