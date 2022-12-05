package day09;

public class Ex01 {

	public static void main(String[] args) {
		//다형성 : C 클래스형의 객체가 B 또는 A 형으로 다양하게 클래스 형태를 바꿀 수 있다.
		C c = new C();
		B b = c;
		A a = c;
		A ad = new D();
		
		//참조값이 다르다. == 출처가 다르다. == 다른 객체이다.
		if(ad instanceof C) {
		C aca = (C)ad;
		}
		
		//출처가 불분명하여 형변환이 불가함.(하위 클래스 -> 상위 클래스)
		//출처 확인 instanceof 연산자 사용.
		if(a instanceof C) {
		C ac = (C)a;
		}
		
	}

}
