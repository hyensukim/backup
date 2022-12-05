package day18;

import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		
		//String 클래스의 경우 final이라서 상속불가하여 메서드 재정의가 불가하나, Comparator
		//클래스를 활용하여 변경 가능하다. -> Comparator 객체를 입력매개변수로 받아야함.
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2)*-1;
			}
		};
		
		//Tree - 순서대로 정렬
		TreeSet<String> names = new TreeSet<String>(comp);
		names.add("이름2");
		names.add("이름3");
		names.add("이름5");
		names.add("이름4");
		names.add("이름1");
		
		System.out.println(names);
		
		
		//String 클래스와 마찬가지로 Integer와 같은 Wrapper 클래스는 final이라서
		//Comparator를 사용하여 바꿔줘야 한다.
		Comparator<Integer> comp2 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2)*-1;
			}
			
		};
		
		TreeSet<Integer> nums = new TreeSet<Integer>(comp2);
		nums.add(20);
		nums.add(21);
		nums.add(19);
		nums.add(25);
		nums.add(15);
		
		System.out.println(nums);
	}
	
}
