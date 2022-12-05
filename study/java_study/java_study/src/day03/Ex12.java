package day03;

public class Ex12 {
//예제 3번
	public static void main(String[] args) {
		int floor = 3;
		switch(floor) {
		case 1 : 
			System.out.println("1층은 약국 입니다.");
			break;
		case 2 : 
			System.out.println("2층은 정형외과 입니다");
			break;
		case 3 : 
			System.out.println("3층은 피부과 입니다");
			break;
		case 4 : 
			System.out.println("4층은 치과 입니다");
			break;
		case 5 : 
			System.out.println("5층은 헬스클럽 입니다");	
			break;
		default :
			System.out.println("없는 층!");
			
		}

	}

}
