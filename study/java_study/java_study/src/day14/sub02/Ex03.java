package day14.sub02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			
			
			System.out.print("숫자 2개를 입력하세요 예)20 30");
			String nums = sc.nextLine();//blocking 상태
			
			if(nums.equals("exit")) {//exit 명령-> 종료
				break;
			}
			System.out.println("입력한 숫자 ? " + nums);
			String[] _nums = nums.split(" "); 
			int n1 = Integer.parseInt(_nums[0]);
			int n2 = Integer.parseInt(_nums[1]);
			System.out.println("덧셈 결과" + (n1+n2));
		}
		
	}

}
