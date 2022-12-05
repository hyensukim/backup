package day08.sub;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * Human human = new Human();
		 * human.move();
		 * 
		 * Fish fish = new Fish();
		 * fish.move();*/
		
		Human[] humans = new Human[3];
		System.out.println(Arrays.toString(humans)); // 힙메모리에 객체 공간 생성.
		humans[0] = new Human();// 참조값 참조변수에 대입
		humans[1] = new Human();
		humans[2] = new Human();
		System.out.println(Arrays.toString(humans));// 힙메모리에 객체 공간에 참조값 대입.
		
		for(Human human : humans) {
			human.move();
		}System.out.println();
		
		Fish[] fishes = new Fish[4];
		fishes[0] = new Fish();
		fishes[1] = new Fish();
		fishes[2] = new Fish();
		fishes[3] = new Fish();
		
		for(Fish fish : fishes) {
			fish.move();
		}
		
		
		
	}

}
