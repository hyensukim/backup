package day07;

public class Calculator {
//메서드는 상수와 같다!! --> 메서드도 데이터 영역 메모리에 저장되어 공유된다.
	
	public final int NUM = 10; // 상수
	
	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
