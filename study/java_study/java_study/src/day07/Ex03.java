package day07;

public class Ex03 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.grade = 3;
		s1.schoolId = 1000;
		s1.name = "학생1";
		System.out.println("s1 ="+s1.toString());
		
		Student s2 = new Student();
		s2.grade = 3;
		s1.schoolId = 1001;
		s2.name = "학생2";
		System.out.println("s2 = "+s2);
		System.out.println("s1 = "+s1);
	}

}
