package day12;

import java.io.*;

public class Ex04 {

	public static void main(String[] args) {
		try {
		loadClass("aaa.txt","Person");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//catch(FileNotFoundException e) {
		//}catch(ClassNotFoundException e) {
		//}
		//catch(Exception e) {
		//catch(File
	}

	public static void loadClass(String fileName, String className) throws FileNotFoundException,
	ClassNotFoundException{//Exception -> 컴파일시 체크되는 예외(엄격한 예외) - 형식 O
		FileInputStream fis = new FileInputStream(fileName);
		Class cls = Class.forName(className);
	}
}
