package day11.sub02;



public class Ex02 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		try {
			int result = num1 / num2;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("무조건 실행");//예외가 있든 없든 항상 실행.
		} 
	
	}
}
