package day09.sub01;

public class Ex03 {
	
	 public static void main(String[] args) {
		// == Animal[] animals = {new Human(),new Human(),new Tiger(),new Tiger()};
		Animal[] animals = new Animal[4];
		animals[0] = new Human();// Animal a = new Human(); 배열도 각각 하나의 변수이다.
		animals[1] = new Human();
		animals[2] = new Tiger();
		animals[3] = new Tiger();
	}
}
