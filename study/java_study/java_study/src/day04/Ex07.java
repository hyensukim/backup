package day04;

import java.util.Arrays;

public class Ex07 {
//다차원 배열 예제
	public static void main(String[] args) {
//		int[][] nums = new int[2][3];
//		
//		nums[0][0] = 10;
//		nums[0][1] = 20;
//		nums[0][2] = 30;
		
//		int[][] nums = new int[][] {{10,20,30},{40,50,60}};

		int[][] nums ={{10,20,30},{40,50,60}};
		// 10 20 30
		// 40 50 60
		System.out.println(nums.length);//행
		System.out.println(nums[0].length);//열
		for(int i = 0; i < nums.length;i++){//행(0,1 -> 2)
			for(int j = 0; j < nums[i].length;j++) {//열(0,1,2 ->3)
				System.out.println(nums[i][j]); //i행, j열
			}
		}
	}

}
