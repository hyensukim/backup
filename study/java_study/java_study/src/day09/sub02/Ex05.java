package day09.sub02;

public class Ex05 {

	public static void main(String[] args) {
		//Calulator calc = new Calculator(); -> 추상메서드 자체는 객체생성이 안되고 상속을 받아야 가능하다.
		SimpleCalculator cal = new SimpleCalculator();
		int result = cal.add(10, 20);
		System.out.println(result);
		
		int result2 = cal.minus(30,20);
		System.out.println(result2);
		
	}

}
