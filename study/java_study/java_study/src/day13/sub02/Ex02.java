package day13.sub02;

public class Ex02 {

	public static void main(String[] args) {
		//생성방법2 -> 상수영역에 메모리 생성.
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		checkString("abc");
	}
	
	public static void checkString(String str) {
		System.out.println(str == "abc");
	}

}
