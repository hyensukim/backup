package day15.sub01;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {// 큰 단점 : 객체 자체의 값이 계속적으로 바뀜.

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//set -> 날짜를 설정해주는 메서드
		cal.set(2022, 8, 30);
		printDate(cal);
		
		cal.set(Calendar.YEAR,2021);
		printDate(cal);
		
		//add -> 날짜 추가 및 감소해주는 메서드
		cal.add(Calendar.MONTH, 1);
		printDate(cal);
		
		cal.add(Calendar.MONTH, -9); //9달 전
		printDate(cal);
		
	}

	private static void printDate(Calendar cal) {
		Date date = cal.getTime();// date형 반환
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(date));
		
	}
	
}
