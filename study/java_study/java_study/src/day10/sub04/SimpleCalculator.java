package day10.sub04;

public class SimpleCalculator implements Calculator,Calculator2{

	@Override
	public int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	//default 하위클래스에서 메서드 재정의 -> 중복된 default 메서드가 누군건지 정의하기 위함.
	public int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
}
