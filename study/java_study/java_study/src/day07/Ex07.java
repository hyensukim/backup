package day07;

public class Ex07 {
	//SingleTon 패턴 - 단 하나의 인스턴스만 생성.
	public static void main(String[] args) {
		Company c1 = Company.getInstance();
		c1.print();
		
		Company c2 = Company.getInstance();
		c2.print();
		
		System.out.println();
		
		//두 객체는 같은 주소값을 갖는다. 같은 객체이다.
		System.out.println(c1 == c2);
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}

}
