package day11.sub02;

import java.io.*;

public class Ex01 {
	public static void main(String[] args) {
		
		//FileInputStream
		
		try {
		FileInputStream fis = new FileInputStream("1111.txt");
		}catch(FileNotFoundException e) {//Throwable
			e.printStackTrace();
		}
		
	}
}
