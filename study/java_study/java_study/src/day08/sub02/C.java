package day08.sub02;

public class C extends B{
	int numC = 30;
	
	public C() {
		super();//B()
		System.out.println("생성자 C");
	}
	
	public void c() {
		System.out.println("메서드 c");
	}
	
	public void b() {
		System.out.println("메서드 b 오버라이드");
	}

}
