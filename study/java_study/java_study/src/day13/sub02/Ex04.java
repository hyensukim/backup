package day13.sub02;

public class Ex04 {
	//StringBuffer 예제
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(500); //16byte -> 500byte(capacity)
		sb.append("I love");
		System.out.println(System.identityHashCode(sb));
		sb.append("java");
		System.out.println(System.identityHashCode(sb));
		
		sb.append("ABC");
		System.out.println(System.identityHashCode(sb));
		
		sb.append("DEF");
		System.out.println(System.identityHashCode(sb));
	
		String str = sb.toString();
		System.out.println(System.identityHashCode(str));
	
	}

}
