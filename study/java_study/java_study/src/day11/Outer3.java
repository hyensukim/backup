package day11;

public class Outer3 {
	//멤버변수처럼 사용.(지역 내부 클래스)
	Runnable run1 = new Runnable() {
		public void run() {
			System.out.println("출력1");
		}
	};
	
	Runnable method(int num1, int num2) {// 예전 버전에서는 final을 추가해줬어야 했지만, 최근 버전들에서는 자동으로 final이 붙게 된다.
		
		//Runnable type return
		return new Runnable(){//익명 내부 클래스
			public void run() {
				System.out.println("출력");
//				num1 = 30; // 상수 - 수정불가.
//				num2 = 40;// 상수 - 수정불가.
//				상수인 이유 : int num1, num2가 지역변수 인경우, 객체 생성과함께 return되어 사라지게 되므로,객체 안에 연산이 되지 않으므로 
//				이를 방지하기 위해서 상수로 대입된다.  
				int result = num1 + num2;// 함수가 끝난 뒤 객체 생성 이후에 연산됨. 지역변수 -> 상수(연산을 위해 제거되지 않음)
				System.out.println(result);
			}
		};
	}
}
