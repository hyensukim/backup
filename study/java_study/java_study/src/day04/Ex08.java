package day04;
//설계도(클래스)를 가지고 자동차(객체)를 만들 공장(main method)
public class Ex08 {
	public static void main(String[] args) {
		Student student = new Student();//객체 생성
		student.name = "학생1";//객체의 멤버변수 정의 및 읽기
		student.grade = 1;//객체의 멤버변수 정의
		student.num = 10;//객체의 멤버변수 정의
		student.study();//객체의 메서드 공유
		student.speak();//객체의 메서드 공유
	}
}
