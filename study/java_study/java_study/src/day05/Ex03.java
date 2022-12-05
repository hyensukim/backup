package day05;

public class Ex03 {
	
	public static void main(String[] args) {// 스택 메모리
		Student s1 = new Student(); //왼쪽항은 스택 메모리 = 오른쪽항은 힙메모리임.
		//Student s1 : 참조 자료형 지역변수(힙메모리에 찾아갈 수 있는 주소값을 담고 있음.)
		s1.name = "학생1"; 
		s1.grade = 3;
		s1.schooId = 1000;		
		s1.studentInfo();
		System.out.println("s1 = " + System.identityHashCode(s1));
		System.out.println();
		
		Student s2 = new Student(); // Student() - 생성자 : 객체를 만드는 일꾼.
		s2.name = "학생2";
		s2.grade  = 2;
		s2.schooId = 1001;
		s2.studentInfo();
		System.out.println("s2 = " + System.identityHashCode(s2));
		System.out.println();
		
		// s2를 s3에 대입 -> s2 객체의 주소값을 s3에 대입하였으므로, 값이 변함.
		Student s3 =s2;
		s3.name = "학생3";
		s3.grade = 1;
		s3.schooId = 1002;
		s3.studentInfo();
		s2.studentInfo();
		System.out.println("s3 = " + System.identityHashCode(s3));		
	}
}
