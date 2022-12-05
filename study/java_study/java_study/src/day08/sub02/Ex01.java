package day08.sub02;

public class Ex01 {

	public static void main(String[] args) {
		// 참조자료형 변수1 = 참조줄, 참조자료형 변수2 = 변수1(==참조줄,참조값,주소값,해쉬코드) 
		C c = new C();
		c.numA=10; c.numB =20; c.numC=30;
		B b = new B();
		b.numA=20; b.numB =30;
		A a = new A();
		a.numA =30;
		
		//다형성
		//상위 클래스(큰범위) -> 하위 클래스(작은범위) (O), 하위 클래스(작은범위) -> 상위 클래스(큰범위)(X)
		A a2 = c;
		B b2 = c;
		System.out.println(c==b2);
		
		a2.a();
		b2.a(); b2.b();
		c.a(); c.b(); c.c();
		
//		if(b2 instanceof C) {
//		C c2 = (C)b2;
//		System.out.println(c2 == c);
//		}else{System.out.println("출처가 잘못됨");
//		}
	}

}
