package day06;

public class Ex02 {
//오버로드된 생성자
	public static void main(String[] args) {
		Student s1 =new Student(3,1000,"학생1"); // 오버로드된 생성자를 이용하여 멤버변수 초기화함.
		s1.studentInfo();
		
		Student s2 = new Student(2, "학생2");
		s2.studentInfo();
		
	}

}
