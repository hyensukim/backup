package day07;

public class Ex04 {

	public static void main(String[] args) {
		//static 요소는 어차피 '데이터 메모리 영역'에 하나만 저장되어 이를 공유되므로,
		//별도로 객체를 만들필요 없이 클래스에서 요소를 호출하여 바로 값을 입력하는 것이 정석이다.
		//클래스 변수
		Student.schoolId = 1001;
		
		//클래스 메서드 -> 정적인 요소는 별도로 객체 생성하지 않아도 사용 가능함.
		Student.print();

	}

}
