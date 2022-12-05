package day03;

public class Ex13 {
//예제 4번
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			if(i%2==0)
				continue;
			System.out.println("==========" + i + "단 ==========");
			for(int j = 1; j <= 9; j++ ) {
				if(i%2 ==1)
					System.out.println(i + " X " + j + " = " + (i *j));
			}
		}
	
		System.out.println();
//예제 5번		
		for(int i = 2; i <= 9; i++) {
			System.out.println();
			for(int j = 1; j <= 9;j++) {
				if(i<j)
					System.out.println(i + " X " + j + " = " + (i *j));
			}
		}	
	}
}
