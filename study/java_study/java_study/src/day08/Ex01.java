package day08;

public class Ex01 {

	public static void main(String[] args) {
		//B class 객체 생성
		//B b = new B(); A() -> B()
		
		//C class 객체 생성;
		C c = new C();// C 클래스형 -> numC, numB, numA 사용 가능.
		B b = c; // B 클래스형 -> numB, numA
		A a = c; // A 클래스형 -> numA
		// 클래스형태만 다를 뿐 3개의 변수값은 모두 하나의 참조값을 참조한다.
		// 즉, A 클래스 객체는 C 클래스 객체라고 할 수 있고, B클래스 객체 또한 C 클래스 객체라고 할 수 있다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//다형성
		
		// 하위클래스  -> 상위클래스 (명시적 형변환)
		C cc = (C)a;// 상위 -> 하위클래스(명시적 형변환)

	}

}
