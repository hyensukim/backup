package day05;

public class Ex02 {
//지역 변수 설명, 함수 호출 예제
	public static void main(String[] args) { //1. main() 메서드 실행.
		 Calculator calc = new Calculator(); // 2. 객체 생성
		 int num1 = 10;
		 int num2 = 20;
		 int sum = calc.add(num1, num2); // 3. 객체의 add() 함수 실행. -> 스택 메모리 내 add() 함수 내 변수(매개변수, 지역변수)들에 공간이 할당.
		 //4. add() 매개변수 10과 20을 복사한 다음 num1과 num2의 공간에 각각 대입하게 됨.
		 //5. add() 메서드 내 연산식을 연산한 다음, 반환값(return)을 반환함. -> 이때 스택 메모리 내 생성되었던 공간들은 삭제됨.
		 //6. 반환값과 똑같은 자료형의 변수에 반환값을 저장함. -> main() 함수 내 result 라는 변수를 담을 메모리를 생성함.
		 System.out.println(sum);
		 
		 int result2 = calc.add(10,20,30);
		 System.out.println(result2);
		
		 
		 calc.minus(30, 20); // 반환값이 없는 메서드 실행, 메서드 내에 실행문이 정의되어 있음.
		 
		 calc.print(); // 매개변수가 없는 메서드 실행
		 
	} //7. 메서드 닫힘과 동시에 메모리를 삭제함.

}
