package day04;

public class Ex09 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();// Calculator 객체 생성 
		
		int num =2;
		int result = calculator.func(num);
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		int result1 = calculator.add(n1, n2);
		System.out.println(result1);
		
		
	}

}
