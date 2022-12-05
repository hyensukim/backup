package day02;

public class ex08 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1--; // num1 = num1-1;
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		
		int num3 = 15; //1.연산(num1 = num1-1),2.대입(num2 = num1)
		int num4 = --num3;
		System.out.println("num3=" + num3);
		System.out.println("num4=" + num4);

	}

}
