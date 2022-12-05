package day15.sub01;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2022,1,28);
		printDate(cal);
//		cal.add(Calendar.DAY_OF_MONTH, 1);
//		printDate(cal);
		
		//roll() 메서드
		//월 사이에서 넘어갈때 월에는 변화가 없고 순수 일만 1증가한다.
		cal.roll(Calendar.DAY_OF_MONTH, 1);
		printDate(cal);
	}

	private static void printDate(Calendar cal) {
		Date date = cal.getTime();// date형 반환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
	}
	
}
