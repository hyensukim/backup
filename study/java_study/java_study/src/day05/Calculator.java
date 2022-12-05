package day05;
// 객체, 함수 사용 예제 복습
public class Calculator {
	//함수 메서드 1
	public int func(int x) {
		int y = x * 2 + 1; //함수 연산을 했다 -> 스택 메모리가 있다.
		return y;
	}
	// 더하기 메서드 2
	public int add(int num1,int num2) {
		int result = num1 + num2;
		return result; // 반환값, 함수 실행 종료 // num1,num2,result -> 지역변수 : 메서드(함수) 내 변수, 즉 여기서 말하는 지역은 함수 안을 말한다.
	}
	
	// 더하기 메서드 -> 매개변수 3개(오버로딩)
	public int add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		return result;
	}
	
	//void(반환값 없음) 메서드 예제 - return(예약어)을 생략가능
	public void minus(int num1, int num2) {
		
		int result = num1 - num2;
		
		System.out.println(result);
	}
	
	public void print() {
		System.out.println("출력!");
	}
	
}
