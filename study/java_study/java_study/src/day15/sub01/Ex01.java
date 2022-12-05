package day15.sub01;

import java.util.Calendar;
import static java.util.Calendar.*;// Calendar. 클래스명 호출 시 클래스명 생략 가능.

public class Ex01 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//내부 메서드로 객체 생성.
		
		//set,get
//		System.out.println(cal);
		int year = cal.get(YEAR);
		int month = cal.get(MONTH);
		int day = cal.get(DAY_OF_MONTH);
		
		// java Calendar에서는 실제 월보다 1적은 수가 출력되므로 달에 +1을 해줘야 한다.
		System.out.println("year = "+ year + ", month = " + (month+1) + ", day = " + day);
		
		int hour = cal.get(HOUR_OF_DAY); // Hour 0~11, Hour_of_day : 0~23
		int min = cal.get(MINUTE);
		int sec = cal.get(SECOND);
		System.out.println("hour = "+ hour + ", min = " + min + ", sec = "+ sec);
	
		int yoil = cal.get(DAY_OF_WEEK);
		System.out.println("yoil = "+yoil);//1(일)~7(토)
		String[] yoils = {"","일","월","화","수","목","금","토"};
		System.out.println("요일 = "+ yoils[4]);
	}

}
