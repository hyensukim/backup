package day09;

public class B extends A{ // 하위클래스는 상위클래스의 자원(멤버변수, 기능)을 사용가능하다.
	int numB = 20;
	
	public B() {
		super();
		System.out.println("B 생성자");
	}

}
