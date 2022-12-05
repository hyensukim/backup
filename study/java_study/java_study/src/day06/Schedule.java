package day06;

public class Schedule {
	// 멤버변수를 직접 대입하게 되면 데이터를 통제할 수가 없다. -> private으로 만든다.
	private int year;
	private int month;
	private int day;
	
	// 값을 설정, 외부에서 접근하기 위해 선언
	public void setYear(int _year) {
		year = _year;
	}
	
	public int getYear() {
		return year;
	}
	
	//  외부에서 접근하기 위해 선언
	public void setMonth(int _month) {
		if(_month < 1) _month = 1;
		else if(_month > 12) _month = 12;
		
		month = _month;
	}
	
	public int getMonth() {
		return month;
	}
	
	//  외부에서 접근하기 위해 선언
	public void setDay(int _day) {
		if(_day < 1) _day = 1;
		else if(_day > 31) _day = 31;
		else if(month == 2 && _day > 28) _day = 28;
		
		day = _day;
	}
	
	public int getDay() {
		return day;
	}
	
	void showDate() {
		System.out.println(year + "-" + month + "-" + day);
	}
}
