package day10.sub01;

public class SimpleCalculator implements Calculator{
	
	public int add(int num1, int num2) {// 하위클래스에서 인터페이스의 추상메서드 접근 시에는 public으로만 가능하다.
		int result = num1 + num2;
		return result;
	}

}
