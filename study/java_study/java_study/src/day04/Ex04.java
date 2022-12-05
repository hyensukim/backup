package day04;

import java.util.Arrays;

public class Ex04 {
// 배열 선언 및 대입 분리
	public static void main(String[] args) {
		int[] nums;
		nums = new int[]{10,20,30};
		//nums = {10,20,30}; -> 이렇게는 분리가 안됨.
		System.out.println(Arrays.toString(nums));
	}

}
