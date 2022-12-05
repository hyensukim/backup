package day17.sub01;

import java.util.*;
public class Ex01 {
	//Set
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("이름1");
		names.add("이름2");
		names.add("이름3");
		names.add(new String("이름3"));
		names.add("이름4");
		names.add("이름5");
		
		String str1 = new String("이름3");
		String str2 = new String("이름3");
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str1 : " + str2.hashCode());
		System.out.println("이름3 hashCode");
		
		//반복자
		Iterator<String> ir = names.iterator();
		while(ir.hasNext()) {
			String name = ir.next();
			//equals, hashCode
			System.out.println(name);
		}
		
		//향상된 for 구문이 더 편리하다.(집합배열들의 내부 요소를 불러올 때)
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
