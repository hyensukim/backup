package day13.sub01;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		long hash1 = System.identityHashCode(str1);
		long hash2 = System.identityHashCode(str2);
		
		System.out.println(hash1);
		System.out.println(hash2);
		
		boolean isSame = str1.equals(str2);
		System.out.println("같은가?"+isSame);
	
		Integer num1 = Integer.valueOf(10);
		Integer num2 = Integer.valueOf(10);
		System.out.println(num1.equals(num2));//물리적 동일성 X, 논리적 동일성 재정의
			
	
	}
	

}
