package day13.sub02;

public class Ex03 {

	public static void main(String[] args) {
		String str = "I LOVE";
		System.out.println(System.identityHashCode(str));
		str += " java";
		System.out.println(System.identityHashCode(str));
		str += " A ";
		System.out.println(System.identityHashCode(str));
		str += "BCD";
		System.out.println(System.identityHashCode(str));
		
		System.out.println(str);
		
		//String Buffer
		
	}

}
