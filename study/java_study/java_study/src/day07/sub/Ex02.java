package day07.sub;

import day07.Calculator;

public class Ex02 {

	public static void main(String[] args) {// 메인 메서드는 JVM꺼다!
		//정적변수 == 클래스 변수
		System.out.println(Student.schoolId);
		Student.schoolId = 1002;
		System.out.println(Student.schoolId);
		
		//정적메서드 == 클래스 메서드
		Student.print2();
	}

}
