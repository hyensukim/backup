package day10.sub05;

public class Outer1 {
	int numOuter = 20;// 인스턴스 생성 후 사용이 가능
	//인스턴스 이너 클래스 -> 인스턴스 변수, 메서드
	class Inner {
		int numInner = 10;
		static int num = 20;
		void print() {
			staticPrint();
			System.out.println("내부 클래스!");
			System.out.println("numOuter = "+ numOuter);
		}
		
		static void staticInnerPrint() {//jdk15까지는 오류, 이후부터는 사용가능.
			
		}
	}

	static void staticPrint() {
		System.out.println("출력");
	}
	
	
}
