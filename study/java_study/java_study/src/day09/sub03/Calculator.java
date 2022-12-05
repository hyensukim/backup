package day09.sub03;
//추상 클래스
public abstract class Calculator {
	
	public int num = 10;
	
	
	//가이드라인 따라야할 기능.
	public abstract int add(int num1, int num2);
	
	public void print() {
		System.out.println("출력");
	}
}
