package day13;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// 모든 클래스는 상위가 Object 이다.(Object가 상위 클래스)
		Student st = new MiddleSchoolStudent();
		String name = "학생";
		
		Object[] data = new  Object[2];
		
		data[0] = st;
		data[1] = name;
		
		System.out.println(Arrays.toString(data));
	}
}
