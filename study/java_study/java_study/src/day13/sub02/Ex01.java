package day13.sub02;

public class Ex01 {
// String class
	public static void main(String[] args) {
		//생성 방법 1
		String str1 =new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);//물리적 위치 다름.
		System.out.println(str1.equals(str2));// 논리적으로는 같음.
		
	}

}
