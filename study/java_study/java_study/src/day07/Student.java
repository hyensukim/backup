package day07;

public class Student {
	int grade;
	static int schoolId; //  정적변수
	String name;
	
	//toString() 메서드 오버라이딩
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", schoolId=" + schoolId + ", name=" + name + "]";
	}
	
	public static void print()	{
		//정적 요소 활성화 -> 처음 로딩, 객체보다 먼저 초기화된다.
		Student s1 = new Student();
		s1.name = "학생1";
		s1.grade = 3;
		Student.schoolId = 1000;
		System.out.println(s1);
		/*
		 * String str = "Student [grade=" + grade + ", schoolId=" + schoolId + ", name="
		 * + name + "]"; System.out.println("출력");
		 */
	}
	
	public void print2() {
		System.out.println("출력2");
		Student.print();//정적 메서드 호출이 가능하다.
		schoolId = 1000; // 동적인 메서드에서는 정적인 것들이 이미 만들어진 상태이므로 사용할 수 있다.
	}
		
}
