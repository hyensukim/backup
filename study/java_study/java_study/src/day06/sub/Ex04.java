package day06.sub;

import day06.Person;//day06.Person 클래스 import

public class Ex04 {
	public static void main(String[] args) {
		Person person = new Person();// person 객체 생성(다른 패키지)
		person.printName(); // 메서드 호출
		
		Korean korean = new Korean(); // Korean 객체 생성(동일 패키지)
		String name = korean.getName(); // name이라는 지역 변수 내 getName() 메서드 반환값 대입. 
		System.out.println(name);//출력	
	}
}
