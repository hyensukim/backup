package day12;

import java.io.*;

public class Ex01 {
	//IOException 예외(Runtime 아닌 예외) -> 컴파일 자체가 되지 않는 예외
	public static void main(String[] args) {
		
		//FileNotFoundException.. 컴파일이 안되서 -> 클래스파일이 만들어지지 않음. -> 실행자체가 안됨.
		try {
			FileInputStream fis = new FileInputStream("aaa.txt");//실제파일X -> 예외 객체를 던지기
			//예외 발생 시 그 하위 코딩은 실행이 되지 않음. -> catch로 넘어감.
			System.out.println("실행되는 부분");
		}catch(Throwable /*Exception*/ e) {//FileNotFoundException e = new FileNotFoundException(..);
			// IOException e = new FileNotFoundException(...);
			// Exception e = new FileNorFoundException(...);
			// 어떤 예외가 발생했는지 모르겠으면, 다형성 : Exception 객체를 생성하여 잡는다.
			System.out.println("예외 발생");
		}
		
		System.out.println("실행");
		
	}
}
