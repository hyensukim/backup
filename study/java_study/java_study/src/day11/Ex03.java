package day11;

public class Ex03 {

	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Runnable runnable = out.method(10,20);//외부클래스 함수 호출 완료, 스택에서 제거
		runnable.run();//지역변수 int num1, int num2 -> 연산에 활용.
		
		out.run1.run();

	}

}
