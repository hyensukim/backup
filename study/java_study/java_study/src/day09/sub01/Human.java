package day09.sub01;

public class Human extends Animal{
	@Override// 기능이아니라 컴파일러에 정보전달만 하여 오버라이드 되어있지 않은 메서드는 오류 발생시킴.
	public void move() {
		//this, super : 해당 클래스, 상위 클래스
		//super.move(); // 상위 클래스의 메서드를 수동으로 호출하는 방법
		System.out.println("두발로 직립보행한다.");
	}
	
}
