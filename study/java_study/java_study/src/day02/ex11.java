package day02;

public class ex11 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		//단락 회로 평가
		boolean result = num1 + num2 > 13 || num1 + num2++ > 9;
		System.out.println(result);
		System.out.println(num2);
	}

}
