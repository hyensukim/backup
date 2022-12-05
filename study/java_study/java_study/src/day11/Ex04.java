package day11;

public class Ex04 {

	public static void main(String[] args) {
		//특정환경(main method)
		Animal animal = new Animal() {
			public void move() {
				System.out.println("움직임");
			}
		};//추상클래스가 특정환경 내에서 정의하여 사용하는 예시.
		
		animal.move();
		
		A a = new A() {
			public void method() {
				System.out.println("메서드 변경");
			}
		};//일반메서드에 정의된 내용을 상속 - 오버라이드 없이 바로 메서드 내용 변경 가능함.
		
		a.method();
	}

}
