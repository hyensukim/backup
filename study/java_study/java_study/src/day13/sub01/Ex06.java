package day13.sub01;

public class Ex06 {
//가변 매개변수 예제
	public static void main(String[] args) {
		fruits("사과","배","바나나","멜론","망고");
	}
	
	//가변적으로 입력한 만큼 배열이 생성됨.
	public static void fruits(String... fruits) {
		System.out.println(java.util.Arrays.toString(fruits));
	}

}
