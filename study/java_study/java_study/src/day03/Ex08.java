package day03;

public class Ex08 {
//for 구문 예제
	public static void main(String[] args) {
		
		for(int num = 1 ;num<=100; num++) {
			if(num%2 == 1)
				continue; // 홀수 건너뛰기
				System.out.println(num);
		}
	}
}
