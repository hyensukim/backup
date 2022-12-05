package day11;

public class Outer1 {//외부
	//인스턴스 내부 클래스
	int num;
	
	class Inner{//인스턴스 내부 클래스 : 인스턴스 변수, 인스턴스 메서드와 동일하게 취급.
		// 이너 클래스 내 일반 메서드 정의
		static int num; // 이너클래스 내에 정적요소 사용 가능(JDK 1.6version 이후)
		void print() { 
			System.out.println("출력!");
		}
		
		static void staticPrint() {//JDK 1.6 version 이후 사용 가능.
			
		}
		
		
	}
}
