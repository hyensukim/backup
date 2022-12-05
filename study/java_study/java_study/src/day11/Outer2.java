package day11;

public class Outer2 {
	int num = 10;
	
	//정적 내부 클래스 : 일반 클래스와 마찬가지로, Outer2 객체와 상관없이 사용 가능.
	static class Inner{// 정적 변수, 정적 메서드와 비슷하다.
		void print() {
			//num =20; -> 인스턴스 변수(non-static)는 static 내부에서 사용 불가함.
			System.out.println("출력2!");
		}
		
	}
}
