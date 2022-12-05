package day08.sub;

public class Fish extends Animal{
	@Override // 애노테이션 : 실수방지용.
	public void move() {
		System.out.println("물속에서 헤엄친다!");
	}
}
