package day11.sub01;

public class Outer {
	
	OrderProduct method(int num1, int num2) {
		//지역내 메서드(기능) 정의하여 객체 생성.
		//인터페이스 객체 생성을 위해 메서드 정의 시, 정의한 메서드 내 지역변수가 포함되어 있는 경우
		//이를 연산하려면 메모리가 있어야 하므로, 이 지역변수는 상수가 된다.
		OrderProduct orderProduct = new OrderProduct() {
			public void order() {
				System.out.println("주문!");
				
				int result = num1 + num2;
				System.out.println(result);
			}
		};
		
		return orderProduct;
	}
}
