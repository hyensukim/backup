package day03;

public class Ex06 {
// do while과 while 의 차이점 예제
// while 조건문에 false가 들어가게 되면 중괄호가 실행되지 않음.
	public static void main(String[] args) {
		boolean result = false;
		while(result) {
			System.out.println("실행이 되나요?");
		}

// do while은 무조건 한번은 실행하도록 구조적으로 되어 있어 한번 실행이 됩니다.
		do {
			System.out.println("실행이 됩니다");
			
		}while(result);
	}
}
