package day10.sub03;

public class Ex01 {

	public static void main(String[] args) {
		//다형성
		Order order = new Order();
		Buy buy = order;
		buy.buy();
		
		Sell sell = order;
		sell.sell();
		
		order.order();
	}

}
