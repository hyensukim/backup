package day07.sub;

public class Student {
	int grade;
	static int schoolId;
	String name;
	static {
		//클래스 로드 -> 실행, static 변수 초기화 블록
	}
	
	void print() {
		print2();
		System.out.println("grade = "+grade+", schoolId = "+schoolId+", name = "+name);
	}
	
	
	static void print2() {
		//정적 메서드에서는 인스턴스 변수 및 메서드 사용이 불가능 하다.
//		String str = "grade = "+grade+", schoolId = "+schoolId+", name = "+name; // 동적요소는 정적 요소 생성 이후에 생성되므로 정적요소 
		//시점에서는 동적요소는 확인이 불가능하다. -> 오류 발생
		System.out.println("출력2");
	}
}
