package day06;

public class Ex05 {

	public static void main(String[] args) {
		Schedule sc = new Schedule();
		//아래와 같이 멤버변수에 직접 대입을 하게될 경우 외부에서 접근할 수 있는 경우가 많아지므로 이러면 오류 발생 확률이 올라간다.
		//그러므로 각 멤버변수의 정보를 은닉하게 된다. 이를 정보 은닉이라고 한다.
//		sc.year = 2022;
//		sc.month = 2;
//		sc.day = 31;
		
		sc.setYear(2022);
		sc.setMonth(2);
		sc.setDay(31);
		
		sc.showDate();
		
		//멤버 변수 직접 접근하는 것을 지양하고, 메서드를 통해 접근하도록 해준다.
		int month = sc.getMonth();
		System.out.println(month);
	}

}
