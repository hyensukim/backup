package day12.sub01;

public class MemberNotFoundException extends Exception{
	public MemberNotFoundException(String message) {
//		super(); <- 상위 클래스의 기본 생성자 super() 자동추가
		super(message);
	}
}
