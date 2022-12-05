package day06;

public class Ex06 {

	public static void main(String[] args) {
		Schedule2 sc = new Schedule2(2022,11,17);
		int year = sc.getYear();
		int month = sc.getMonth();
		int day =sc.getDay();
		System.out.println(sc.toString()); // 실제 sc라는 객체를 호출 시 뒤에 .toString()이라는 메서드가 숨겨져 있다.
		//이러한 toString() 메서드는 재정의(override)하여 사용한다.
		
		/*
		sc.printThis();
		System.out.println("sc   = "+sc);
		
		Schedule2 _this = sc.getThis();
		System.out.println(sc == _this);
		*/
	}

}
