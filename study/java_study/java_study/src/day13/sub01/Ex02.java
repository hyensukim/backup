package day13.sub01;

public class Ex02 {

	public static void main(String[] args) {
		Person p1 = new Person(30,"이름1"); // p1 - 객체 참조 주소값
		Person p2 = new Person(35,"이름2"); // p2 - 객체 참조 주소값
		Person p3 = p1;
		boolean isSame = p1.equals(p2); // == 과 동일
		System.out.println(isSame);
		
		boolean isSame2 = p1.equals(p3);
		System.out.println(isSame2);
		
	
	
	}

}
