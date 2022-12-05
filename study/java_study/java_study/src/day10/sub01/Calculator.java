package day10.sub01;

// interface는 설계 목적으로 만든것이므로 추상메서드만 구현되어 있다.
public interface Calculator {
	int num = 10; // public static final -> 그냥 final도 안된다. 정적 상수만 가능!!
	// == public abstract int add(int num1, int num2);
	int add(int num1, int num2); // 컴파일러가 자동으로 public abstract를 자동 입력 해준다, 인터페이스는 public만 사용가능하다.
	
	//default 키워드 -> 컴파일러에서 인스턴스 메서드로 인식함.
	default int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	public static int  times(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	private void print() {
		System.out.println("출력");
	}
	
}
