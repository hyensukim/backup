package day14;

public class Ex03 {
	//Wrapper 클래스 예제
	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(20);
		
		int num6 = num1 + num2;//num1.intValue() + num2.intValue() = 30;
		int num7 = 30 + num2;// 30 + num2.intValue();
		
		int num3 = num2;// num2.intValue(); -> JAVA 1.4 version 이후 부터는 자동으로 변형됨. Integer -> int : 언박싱
		
		int num5 = 30;
		Integer num4 = num5;// Integer.valuOf(num5); int -> Integer : 오토박싱
		
		//byte num2 = num1.byteValue();
		
		
	}

}
