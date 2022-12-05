package day07;

public class Ex06 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.NUM);

		Calculator cal2 = new Calculator();
		System.out.println(cal2.NUM);
		//메서드랑 함수, 메인메서드도 static 인데 그러면 이것도 데이터 영역에 로딩되어야 하는 것이 아닌가... 스택영역에 저장되는 것이 아니고?
	}

}
