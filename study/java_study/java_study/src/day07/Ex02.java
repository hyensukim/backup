package day07;

public class Ex02 {
	public static void main(String[] args) {
		Schedule s1 = new Schedule(2022,11,18);
		Schedule _this = s1.getThis();
		System.out.println("this = "+_this);
		System.out.println("s1 = "+s1);
		System.out.println(s1 == _this);
		System.out.println();
							
		Schedule s2 = new Schedule();
	}
}
