package day14.sub02;

// 임포트하여 클래스명 호출하지 않고 바로 메서드 호출 가능함.
import static java.lang.Math.*;

public class Ex01 {

	public static void main(String[] args) {
		// java.util.Math : 수학과 관련된 유용한 기능.
		
		int num = -10;
		System.out.println(abs(num));
		
		double num2 = 3.6;
		System.out.println(ceil(num2));//올림
		System.out.println(floor(num2));//버림
		System.out.println(round(num2));//반올림 -> 정수형 반환

		
		
	}

}
