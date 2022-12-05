package day09.sub01;

public class Ex04 {

	public static void main(String[] args) {
		//배열 객체 생성.
		Animal[] animals = {new Human(), new Tiger(), new Fish()};
		
		for(Animal animal : animals) {
			animal.move();
		}
		
	}

}
