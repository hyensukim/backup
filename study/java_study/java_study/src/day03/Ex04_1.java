package day03;

public class Ex04_1 {
//switch case 예제
	public static void main(String[] args) {
		String floor = "10층";
		switch(floor) {
		case "1층":
			System.out.println("1층");
			break;
		case "2층":
			System.out.println("2층");
			break;
		case "3층":
			System.out.println("3층");
			break;
		case "4층":
			System.out.println("4층");
			break;
		case "5층":
			System.out.println("5층");
			break;
		default : 
			System.out.println(floor +"은 없는 층");
		}

	}

}
