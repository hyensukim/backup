package day10.sub05;

public class Ex01 {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Outer1.Inner in = out. new Inner();//인스턴스 이너 클래스 객체 생성.
		in.print();
		
		
	}

}
