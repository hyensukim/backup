package day11.sub01;

public class Ex02 {
	public static void main(String[] args) {
		Animal animal = new Animal() {
			public void move() {
				System.out.println("움직인다.");
			}
		};
		
		animal.move();
		
		//상속 - 메서드오버라이드 기능 대신 간단하게 재정의하는 방법.
		A a = new A() {
			public void method() {
				System.out.println("메서드가 맘에 안드렁!");
			}
		};
		a.method();
	}
}
