package day11;

public class Ex01 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Outer1.Inner in = out.new Inner(); // 외부 인스턴스 생성 후 내부 인스턴스 생성 가능.
		in.print();

		
	}
}
