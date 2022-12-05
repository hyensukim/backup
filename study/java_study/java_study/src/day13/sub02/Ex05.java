package day13.sub02;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer num1 = new Integer(10);
//		c
//		Integer num2 = new Integer(10);
//		System.out.println(System.identityHashCode(num2));
//		int num3 = num1 + num2;
//		System.out.println(num3);
		
		//valueOf() 를 사용하여, 같은 값을 담은 객체 사용 ->메모리 낭비를 줄인다.		
		Integer num1 = Integer.valueOf(10);
		Integer num2 = Integer.valueOf(10);
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2));
		
		//객체를 기본 자료형에 대입하는 경우
		int num3 = num1; // Integer num1// 래퍼클래스 -> 기본자료형 자동 변환(언 박싱)
		//int num3 = num1.intValue(10); -> 자동으로 내부적으로 intValue가 호출되어 오류가 발생되지 않음.
		System.out.println(num3);
		
		int num4 = 40;
		Integer num5 = num4;// 기본자료형 -> 래퍼클래스 자동 변환(오토 박싱)
		//Integer num5 = Unteger.valueOf(num4);
		
	}

}
