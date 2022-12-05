package day12.sub02;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("aaa.txt");
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try{
					fis.close();
				}catch(IOException e) {}
			}
		}	
	}
}
