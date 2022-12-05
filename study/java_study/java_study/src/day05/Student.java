package day05;

public class Student {
//클래스(설계도) 정의
	
	//멤버변수
	String name;//이름
	int grade;//학년
	int schooId;//학번
	
	//★ 생성자 오버로딩 : 생성자의 매개변수를 다르게 해서 이름을 똑같도록 정의함.
	//기본 생성자
	public Student() {
		
	}
	
	//매개변수 다르게 생성자 정의
	public Student(int _grade,String _name) {
		grade = _grade;
		name = _name;
	}
	
	//매개변수를 또 다르게 생성자 정의
	public Student(int _grade, int _schooId, String _name) {
		grade = _grade;
		schooId = _schooId;
		name = _name;
	}
	
	//메서드
	public void studentInfo() {
		System.out.println("학년 = " + grade + ", 학번 = " + schooId + ", 이름 = " + name);
	}
	
}
