package day04;

import java.util.Arrays;

public class Ex01 {
// 배열의 편리성 관련 예시
	public static void main(String[] args) {
		//1000~1099 까지 학생의 학번을 지정한다.
		int[] students = new int[100];
		
		for(int i = 1000; i < 1100; i++) {
			students[i-1000] = i;
		}
		
		System.out.println(Arrays.toString(students));
	}

}
