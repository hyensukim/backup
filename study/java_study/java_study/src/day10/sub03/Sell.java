package day10.sub03;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("주문");
	}
}
