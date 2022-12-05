package day09.sub01;

public class Ex02 {
	//오버라이드
	public static void main(String[] args) {
		//다형성
		Animal[] animals = {new Human(),new Human(),new Tiger(), new Tiger()};// 배열공간에 객체 생성 후 넣기
//		Animal[2] = new Tiger(); // 다형성으로 인해 하위에서 상위형으로 변환가능.
//		Tiger[] tigers = {new Tiger(), new Tiger()};
		
		for(Animal animal : animals) {
			System.out.println(System.identityHashCode(animal));
			animal.move();
		}
		
		//다형성, 
		Animal a = new Human();
		Animal b = new Tiger();
		
//		Human human = new Human();
//		human.move();
//		
//		Tiger tiger = new Tiger();
//		tiger.move();
//		
//		Fish fish = new Fish();
//		fish.move();
	
	}

}
