package day10;

public class Ex01 {
	// 추상클래스 자체는 메서드(기능)가 정의되어 있지 않아, 기능을 못해 객체 생성이 불가능하다.
	// 정의하다({}) : 일반메서드, 구현하다(;) : 추상메서드
	public static void main(String[] args) {
		Calculator cal = new SimpleCalculator();
		
		cal.num = 20;
		System.out.println(cal.num);

		int result = cal.add(10, 20);
		System.out.println(result);
		
		int result2 = cal.minus(30, 20);
		System.out.println(result2);
		
		cal.print();
		
		
	}
}
