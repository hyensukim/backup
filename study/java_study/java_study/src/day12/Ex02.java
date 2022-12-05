package day12;

public class Ex02 {
	//RuntimeException -> 컴파일은 됨 -> 클래스 파일 생성 -> 실행 후 예외 발생시 예외 출력후 종료. -> 이후의 실행문 출력되지 않음.
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		try {
		int result = num1/num2; // 던짐
		System.out.println(result);
		System.out.println("실행되나?");// 실행안됨
		}catch(Exception e) {//잡음
			//RuntimeException e = new ArithmeticException(...);
			//Exception e = new ArithmeticException(...); -> 다형성
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("항상실행!");
		}
		System.out.println("실행");
		
		//컴파일 및 실행 되지만 실행중 오류가 발생한다. -> RuntimeException
	}

}
