package day17;

import java.util.Arrays;
public class Ex02 {
	//ArrayList
	public static void main(String[] args) {
		
		String[] names = new String[] {"이름1","이름2","이름3","이름4","이름5"};
		String[] newNames = new String[4];
		String[] part1 = Arrays.copyOfRange(names, 0, 2);
		String[] part2 = Arrays.copyOfRange(names, 3, 5);
		System.out.println(Arrays.toString(part1));
		System.out.println(Arrays.toString(part2));
		
		for(int i =0;i<part1.length;i++) {
			newNames[i] = part1[i];
		}
		
		for(int i = part1.length;i<part1.length+part2.length;i++) {
			int no = i - part1.length;
			newNames[i] = part2[no];
		}
		
		System.out.println(Arrays.toString(newNames));
	}

}
