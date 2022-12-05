package day17;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class Ex04 {
	//ListIterator
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for(int i =0;i <10;i++) {
			names.add("이름"+(i+1));
		}

//		ListIterator<String> ir = names.listIterator();//순방향, 역방향 가능.
//		while(ir.hasNext()) {
//			String name = ir.next();
//			System.out.println(name);
//		}
//		//역방향으로 다시 조회가능. -> hasPrevious(), previous()
//		while(ir.hasPrevious()) {
//			String pName = ir.previous();
//			System.out.println(pName);
//		}
		
		printNames(names);
	}
	
	private static void printNames(List<String> names) {
		ListIterator<String> ir = names.listIterator();
		while(ir.hasNext()) {
			String name = ir.next();
			System.out.println(name);
		}
		
	}

}
