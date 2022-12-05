package day10.sub04;

public interface Calculator2 {
	//추상메서드
	int add(int num1,int num2);
	
	default int minus(int num1, int num2) {
		
		int result = num1 - num2;
		return result;
	}
}
