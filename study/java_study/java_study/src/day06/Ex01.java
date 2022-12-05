package day06;

public class Ex01 {
// 데이터 메모리영역에 클래스 로더에 의해 클래스 올라감 ->static 초기화 -> main()함수 내 지역변수 초기화 -> 힙메모리 영역에 객체 관련 특징, 기능 생성.
// stack 메모리 s1은 힙에 있는 메모리에 접근할 수 있는 주소값(hash code)을 참조한다.
	//stack 메모리는 함수연산을 위한 임시적인 메모리, 힙메모리는 실제 값을 저장하는 메모리
	public static void main(String[] args) {
		Student s1 = new Student(); // 인스턴스 생성
		s1.grade = 3;
		s1.schoolId = 1000;
		s1.name = "학생1";
		s1.studentInfo();
		//System.out.println(s1); // hash code(주소값) : 클래스명@주소
		System.out.println("s1 = "+System.identityHashCode(s1)); // 실제 정수값.(4byte)	
		System.out.println();
		//s1 = null;// 주소값이 null, 객체와 참조가 끊김.
					
		Student s2 = new Student();
		s2.grade = 2;
		s2.schoolId = 1001;
		s2.name = "학생2";
		s2.studentInfo();
		System.out.println("s2 = "+System.identityHashCode(s2));
		System.out.println();
		
		Student s3 = s2; // s3에 s2가 참조하고 있는 heap 메모리의 주소값을 대입함.
		//즉, s3 또한 s2가 참조하고 있는 heap 메모리 주소값을 함께 참조하고 있다.
		s3.grade = 1;
		s3.schoolId = 1003;
		s3.name = "학생3";
		s3.studentInfo();
		System.out.println("s3 = " + System.identityHashCode(s3));
		
		//instanceof 연산자 예제
		boolean isStudentObject = s2 instanceof Student;
		System.out.println(isStudentObject);
		
	}

}
