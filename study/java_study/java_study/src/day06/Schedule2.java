package day06;
//정보 은닉
public class Schedule2 {
	private int year;
	private int month;
	private int day;
	
	//기본 생성자 정의(오버로드)
	public Schedule2() {
		this(2022,11,17);//생성자를 정의
	}
	
	// 생성자 정의
	public Schedule2(int year, int month, int day) {
		this.year = year; // 힙메모리 객체의 year에 schedule2(); 생성자의 지역변수를 대입.
		this.month = month;
		this.day = day;
	}

	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
//	public String toString() {
//		String str = "year : " + year + ", month : " + month + ", day : " + day;
//		return str;
//	}
	
	public void printThis() {
		System.out.println("this = " + this);
	}
	
	public Schedule2 getThis( ) {
		return this;
	}

	@Override
	public String toString() {
		return "Schedule2 [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
