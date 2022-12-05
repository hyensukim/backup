package day10.sub03;

public class Order implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매");
	}

	@Override
	public void buy() {
		System.out.println("구매");
		
	}
	
//	//방법 1
	//교통정리
//	@Override
//	public void order() {
//		// TODO Auto-generated method stub
//		Sell.super.order();
//	}
	//방법 2
	public void order() {
		System.out.println("주문-order");
	}
	

}
