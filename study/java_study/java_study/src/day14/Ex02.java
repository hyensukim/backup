package day14;

public class Ex02 {

	public static void main(String[] args) {
		// str1 == str2(논리적 동일성), 상수영역의 메모리를 공유함.
		String str1 = "abc";// 문자열 상수
		String str2 = "abc";// 문자열 상수
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		checkString("abc");// "abc".equals("abc"); -> 논리적 동일성
		checkString(new String("abc"));// "abc".equals("abc"); -> 논리적 동일성
		//int num1 = 10;//리터럴 상수
	}

	public static void checkString(String str) {
		System.out.println(str.equals("abc"));
	}
	
	
}
