package day09.sub02;

public class SimpleCalculator extends Calulator{
	
	//구현체(중괄호)
	//추상클래스는 하위클래스가 반드시 해당 메서드를 구현해야 객체 사용이 가능하다.
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}



}
