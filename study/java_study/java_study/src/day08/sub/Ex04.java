package day08.sub;

public class Ex04 {
	//다형성 : Animal 클래스(일반적) > Human, Fish, Tiger, Bird 
	//각 클래스들이 Animal 자료형의 배열에 대입이 가능하다. 이유 : 각 클래스가 Animal을 상속하고 있으므로, super : Animal
	public static void main(String[] args) {
		Animal[] animals = new Animal[4];
		
		//Animal human = new Human();
		//Animal fish = new Fish();
		
		animals[0] = new Human(); // Animal animals = new Human();
		animals[1] = new Fish(); // Animal animals = new Fish();
		animals[2] = new Tiger();// Animal animals = new Tiger();
		animals[3] = new Bird();// Animal animals = new Bird();
		
		for(Animal animal : animals) {
			animal.move();
		}
		
		
		
	}
}
