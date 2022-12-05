package day08.sub;

public class Ex06 {
	// super 일반적인 상위가 범위가 작음, 자세한 하위가 범위가 큼. == 상위에 내용을 추가하기 위해 하위를 사용하며, 이러한 이유로 하위가 범위가 더 크다. 
	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
		
		human.move();
		tiger.move();
		
		//Human 내에만 정의된 메서드를 호출하기 위해서는 Human으로 형변환 해줘야한다.
		//instanceof 객체의 출처 확인.
		if(human instanceof Human) {
		Human human2 = (Human)human;
		human2.reading();
		}
		
		if(tiger instanceof Tiger) {
			Tiger tiger2 = (Tiger)tiger;
			tiger2.hunting();
		}
	}
}
