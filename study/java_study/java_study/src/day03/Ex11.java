package day03;

public class Ex11 {
// ★예제 2번 -> 나머지 연산을 이용하여 0 ~ 9의 나머지들을 나열함.
	public static void main(String[] args) {
		
		for(int i = 1; i <= 40; i++) {
			int room = i % 10;
			System.out.println("학생" + i +" , " + "방번호"+ room);
			
		}

	}

}
