package day07.sub;

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.grade = 3;
		s1.schoolId = 1000;
		s1.name = "이름1";
		s1.print();
		
		Student s2 = new Student();
		s2.grade = 2;
		s2.schoolId = 1001; 
		s2.name = "이름2";
		s2.print();
		s1.print();// -> s1의 schoolId 값이 1001로 수정되어 있음.
		//★ static 변수(클래스 변수)는 '데이터 메모리 공간'에 존재하며, 이를 공유하여 사용한다. == 상수
		//따라서, s1에서 schoolId에 값을 대입하나, s2에서 값을 대입하나 하나의 공간에 값을 대입한 
		//것이므로 마지막으로 s2.schoolId에 대입한 1001 값이 대입된 것이다.
	}
}
