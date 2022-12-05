package day07;

public class Ex01 {
	//인스턴스 생성
	public static void main(String[] args) {
		Student s1 = new Student(); // 실제 생성자 메서드를 통해서 만들어진다.
		s1.grade = 3;
		s1.schoolId = 1000;
		s1.name = "학생1";
		System.out.println(s1);// toString 오버라이딩함.
		System.out.println(System.identityHashCode(s1)); // 주소값을 정수형으로 출력
		
		Student s2 = new Student();
		s2.grade = 2;
		s2.schoolId = 1001;
		s2.name = "학생2";
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2)); // 독립된 공간이 생김
		
		Student s3 =s1;
		System.out.println(System.identityHashCode(s3));
		s3.grade = 5;
		s3.schoolId = 1003;
		System.out.println(s3);
		System.out.println(s1);
		
		//s2에 null을 대입하면 객체 참조줄이 끊김.
		// Garbage Collector에 의해 heap 메모리 내의 필요없는(참조가 없는) 인스턴스를 제거해줌.
		s2 = null;
		System.out.println(s2);
	}

}
