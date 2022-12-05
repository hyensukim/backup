package day07;

public class Schedule {
	private int year;
	private int month;
	private int date;
	
	//생성자정의 -> 멤버변수 초기화
	public Schedule(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		System.out.println("year :"+year + ", month :"+month+", date :"+date);
	}
	
	//this() 생성자 메서드 -> 같은 클래스 내부에서 정의된 생성자를 불러온다. -> 가장 위에 정의해야한다. -> 한번만 호출 가능함.
	public Schedule()	{
		this(2022,02,31);
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
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public Schedule getThis() {
		return this;
	}
	
}
