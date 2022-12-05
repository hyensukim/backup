package day03;

public class Ex09 {
// 중첩 for 구문 관련 구구단 예제
	public static void main(String[] args) {
		for(int i = 2 ; i <= 9; i++) {
			System.out.println("=========== "+ i + "단 ===========");
			for(int j = 1;j <= 9;j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println("=========== "+ i + "단 끝 ===========");
			System.out.println();
		}
	}
}
