package day13.sub01;

import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		Person p1 = new Person(30,"이름");
		//toString()
		System.out.println(p1.toString());
		System.out.println(p1);
		
		//String class에서 toString()을 재정의
		String name = "이름!";
		System.out.println(name.toString());
		
		//Date class에서 toString()을 재정의
		Date date = new Date();
		System.out.println(date.toString());
		
	}

}
