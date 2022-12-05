package day03;

public class Test03 {

	public static void main(String[] args) {
		String step = "5층";
		switch(step) {
		case "1층" :
			System.out.println("1층 약국입니다.");
			break;
		case "2층" :
			System.out.println("2층 정형외과입니다.");
			break;
		case "3층" :
			System.out.println("3층 피부과입니다.");
			break;
		case "4층" :
			System.out.println("4층 치과입니다.");
			break;
		case "5층" :
			System.out.println("5층 헬스클럽입니다.");
			break;
		default :
			System.out.println("이건물에 있는 층이 아닙니다.");
		}

	}

}
