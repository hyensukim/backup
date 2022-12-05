package day03;

public class Ex04 {
	//switch case 예제
	// 조건 변수로는 정수형만 가능하나, 업데이트 되면서 "문자열"도 가능해졌다.
	public static void main(String[] args) {
		int floor = 10;
		switch(floor) {
		case 1:
			System.out.println("1층");
			break;
		case 2:
			System.out.println("2층!");
			break;
		case 3:
			System.out.println("3층");
			break;
		case 4:
			System.out.println("4층");
			break;
		case 5:
			System.out.println("5층");
			break;
		default : 
			System.out.println(floor +"층은 없는 층");
		}
	}
}
