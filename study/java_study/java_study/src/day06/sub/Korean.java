package day06.sub;

import day06.Person;

public class Korean extends Person{
	//protected는 외부 패키지의 경우, 상속받은 클래스의 내부에서만 사용이 가능하다.
	public String getName() {// 메서드 정의
		return name;
	}
}
