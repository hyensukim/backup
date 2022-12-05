package day12.sub02;

import java.io.*;

public class Ex02 {
//resource 해제 
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis  = new FileInputStream("aaa.txt");
		try(fis/*자동 리소스(자원) 해제_ JDK 1.8 이상 버전*/){
		int i = 0;
		while((i= fis.read()) != -1) {
			System.out.println((char)i);
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
