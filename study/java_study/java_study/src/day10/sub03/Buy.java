package day10.sub03;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("주문");
	}
}
