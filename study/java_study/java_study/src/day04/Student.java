package day04;
//자동차(객체)를 만들기 위한 설계도(클래스)
public class Student {
	//멤버변수
	int grade;//학년
	int num;//학번
	String name;//학생명
	
	//메서드
	void study() {
		System.out.println(name + "가 공부를 합니다.");
	}
	
	void speak() {
		System.out.println("학년은 " + grade + "학년 ," + "학번은 " + num + "번 입니다.");
	}
	
	
}
