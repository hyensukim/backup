package day13.sub01;

public class Ex04 {

	public static void main(String[] args) {
		Person p1 = new Person(30,"이름1");
		Person p2 = new Person(30,"이름1");
		
		boolean isSame = p1.equals(p2);
		System.out.println(isSame);
		System.out.println(System.identityHashCode(p1));//물리적 위치 - 해쉬코드
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
