package day09.sub03;

public class Ex06 {

	public static void main(String[] args) {
		Calculator cal = new SimpleCalculator();// 다형성
		
		if(cal instanceof SimpleCalculator) {
		SimpleCalculator cal2 = (SimpleCalculator)cal; // 다형성
		}
		int result = cal.add(10, 20);
		System.out.println(result);
		
		cal.num = 20; // 상속을 통해 객체가 만들어진다.
		System.out.println(cal.num);
		
		cal.print();
	}

}
