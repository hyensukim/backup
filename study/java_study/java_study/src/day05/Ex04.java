package day05;

public class Ex04 {
//생성자 오버로딩 예제
	public static void main(String[] args) {
		Student s1 = new Student(3,1003,"이름");
		s1.studentInfo();
		
		Student s2 = new  Student(2,"이름2");
		s2.studentInfo();
		
	}

}
