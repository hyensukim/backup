package day13.sub02;

public class Ex06 {

	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = 20;
		
		//원래는 형이 같아야 연산이 가능하다.
		// 하지만, JDK1.5부터 연산시 자동으로 오토박싱 언박싱된다.num2 -> Integer num2 -> intValue() -> int num2(언박싱)
		int num3 = num1 + num2;
		System.out.println(num3);
		
	}

}
