package day04;
public class Ex05 {
//index 별로 값이 무엇이 들어있는지 확인하는 방법
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		System.out.println("length = "	+ nums.length);// 배열의 길이를 확인하는 필드
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		System.out.println();
		
//for문과 배열은 함께 자주 쓰임 -> 구조적 특징 때문에.
		for(int i =0; i < nums.length; i++) {// index의 갯수 만큼 호출하게 됨.별도로 조건식을 수정하지 않아도 된다.
			System.out.println(nums[i]);
		}
	}
}
