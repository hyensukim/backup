package day17;

import java.util.Vector;
public class Ex03 {
	//Vector - capacity() 메서드 -> 메모리 갯수를 확인하는 메서드
	//List의 메모리 공간 정의 후, 그 공간을 초과 시, 그 공간의 2배로 공간을 추가한다.
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>(3);
		int cap =vc.capacity();
		vc.add("이름1");
		vc.add("이름2");
		vc.add("이름3");
		System.out.println(cap);
		vc.add("이름4");
		cap = vc.capacity();
		System.out.println(cap);
		vc.add("이름5");
		vc.add("이름6");
		vc.add("이름7");
		cap = vc.capacity();
		System.out.println(cap);
		
	}

}
