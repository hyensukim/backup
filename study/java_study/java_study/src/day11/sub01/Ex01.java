package day11.sub01;

public class Ex01 {

	public static void main(String[] args) {
		Outer out = new  Outer();//out 객체 생성
		OrderProduct Orderproduct = out.method(10,20);
		Orderproduct.order();
	}
}
