package day10.sub05;

public class Outer3 {
	void method() {
		
			Runnable runnable = new Runnable() {
				public void run(){
					System.out.println("구현!");
				}
			};
			
			runnable.run();
	}
}
