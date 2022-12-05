package day11.sub02;

public class Ex04 {

	public static void main(String[] args) {
		try {
		int result = add(10,0);
		System.out.println(result);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("실행1");
	}
	
	//runtime예외 에서는 thorws를 안써도 전가됨. 
	public static int add(int num1, int num2) {
//		try {
			
		int result = num1 / num2;
		return result;
		
//		}catch(ArithmeticException e) {
//			return 0;
//		}
	}

}
