package day10.sub04;

public class Ex01 {

	public static void main(String[] args) {
		SimpleCalculator cal = new SimpleCalculator();
		int result = cal.minus(30, 10);
		System.out.println(result);
		cal.minus(50, 40);
		
		Calculator.print();
		
	}

}
