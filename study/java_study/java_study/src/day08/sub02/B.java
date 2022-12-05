package day08.sub02;

public class B extends A{
	int numB = 20;
	
	public B() {
		super();//A()
		System.out.println("생성자 B");
	}
	
	public void b() {
		System.out.println("메서드 b");
	}
}
