package day02;

public class ex02 {
	public static void main(String[] args) {
		int num1 = 100000;
		double num2 = num1;
		System.out.println(num2);
		
		float num3 = 10000.1234F;
		long num4 = (long)num3;// byte , short , int , long 은 정수이기에 실수에 소수점 자리는 날려버림.
		System.out.println(num4);
		
		long num5 = 100000000000L;
		float num6 = num5; // 실수 > 정수
	}
}
