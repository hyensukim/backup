package day12;

import java.io.*;


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadClass("aaa.txt","Person");
	}
	
	public static void loadClass(String fileName, String className) {
		try {
		FileInputStream fis  = new FileInputStream(fileName);//FileNotFoundException
		Class cis= Class.forName(className);//ClassNotFoundException 
		}catch(ClassNotFoundException | FileNotFoundException e) { // 다중 예외 타입 객체 선언
//			System.out.println("클레스없음처리");
		}catch(Exception e) {//예외가 발생한 부분이 객체로 던져짐.
			//String message = e.getMessage();
//			System.out.println(message);
			e.printStackTrace();
		}
	}

}
