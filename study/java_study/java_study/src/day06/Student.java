package day06;

public class Student {
	//멤버변수
	int grade;
	int schoolId;
	String name;

	//기본 생성자
	public Student() {}
	
	//생성자 오버로드
	public Student(int _grade, String _name) {
		grade = _grade;
		name = _name;
	}
	
	public Student(int _grade, int _schoolId, String _name) {
		//객체 공간이 만들어지고 난 다음에 이뤄지는 과정이다.
		grade = _grade;
		schoolId =_schoolId;
		name = _name;
	}
	
	public void studentInfo() {
		System.out.println("학년 : " + grade + ", 학번 : " + schoolId + ", 이름 : " + name);
	}
}
