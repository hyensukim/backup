package day10;

//추상클래스 : 예약어 abstract -> 컴파일러에서 abstract라는 예약어를 인지해야 추상적이라고 판단함.
public abstract class Calculator {
	
	int num = 10;
	//추상메서드, abstract -> 객체 생성불가./ 상속을 통해서만 생성 가능.
	//하위클래스가 반드시 구현할 메서드 규약, 가이드라인, 설계
	public abstract int add(int num1, int num2);// {  } 구현체가 없음.
	public abstract int minus(int num1,int num2);
	
//	//상속을 통해 하위클래스에서 사용하기 위해 정의함.
	public void print()	{
		System.out.println("출력");
	}
	
}
