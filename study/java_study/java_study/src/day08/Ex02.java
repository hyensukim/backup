package day08;

public class Ex02 {

	public static void main(String[] args) {
		A ad = new D(); // D 객체를 A 안에 넣을 수 있다.
		System.out.println(ad);
		A ac = new C(); // C 객체를 A 안에 넣을 수 있다.
		System.out.println(ac);
		
//		C acd = (C)ad; // D 객체는 C 입장에서 출처가 불명(주소값이 다름)하다.
		System.out.println(ad instanceof D);
		System.out.println(ac instanceof C);
		
		//출처 확인.
		if(ad instanceof C) {
			C acd = (C)ad;
		}
		
	}

}
