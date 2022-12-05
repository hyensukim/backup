package day03;

public class Ex03 {
// if 조건문 예제
	public static void main(String[] args) {
		// 10 이상, 20 이하, 짝수인 수
		int num = 16;
		if(num >= 10 && num <= 20 && num % 2 == 0) {
			System.out.println("OK");
		}else {
			System.out.println("Not OK");
		}
	}
}
