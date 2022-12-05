package day02;

public class ex07 {

	public static void main(String[] args) {
		int num1 = 10;
		/*
		num1++; // num = num + 1;
		num1++; // num = num + 1;
		*/
		/**
		++num1; // num = num + 1
		++num1; // num = num + 1
		**/
		
		int num2 = num1++; // 1. 대입(num2 = num1) 2. 연산(num1 = num1 + 1) 대입이 먼저 그다음에 연산이 진행되기때문에 num2에는 10 num1에는 11이 있는것.
		
		//int num2 = ++num1   //1. 연산(num1 = num1+1),2대입(num2 = num1) 연산이 먼저 그다음 대입이 되기때문에 num1 과 num2 의 값이 동일하게 11
		System.out.println("num1 = "+ num1);
		System.out.println("num1 = "+ num2);
	
	}

}
