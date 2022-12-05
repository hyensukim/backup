package day02;

public class ex01 {
	public static void main(String[] args) {
		byte num1 = 100;
		int num2 = num1;
		
		float num3 = 3.14f;
		double num4 = num3;
		// 묵시적 형변환
		
		int num5 = 1000000;
		byte num6 = (byte)num5;
		System.out.println(num6); // int 를 byte에 담을 수 있지만 크기의 차이로 인하여 완전한 값을 가져오지 못함.
		
		double num7 = 3.146632158;
		float num8 = (float)num7;
		// 명시적 형변환 
	}
}
