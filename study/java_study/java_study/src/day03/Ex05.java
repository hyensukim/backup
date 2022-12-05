package day03;

public class Ex05 {
//while 구문 예제
	public static void main(String[] args) {
		int num = 1; // 초기화식
		boolean result = true;
		while(num <= 100) { // 조건식
			if(num % 2 == 0) {
			System.out.println(num);
			}
			num++; // 증감식
		}
//break 키워드 사용
		num = 1; 
		while(result) {
			System.out.println(num);
			if(num == 50) 
				break;
			num++;
		}
		
	}
}
