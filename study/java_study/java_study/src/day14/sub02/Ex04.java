package day14.sub02;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(new File("data.txt"));
		int total = 0;
		while(sc.hasNext()) {//hasNext() : 다음에 토큰이 있는가? 없으면 false
			int num = sc.nextInt();
//			System.out.println(num);
			total += num;
		}
		System.out.println("합계 = " + total);
	}

}
