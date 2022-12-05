package day14.sub03;
//클래스 형식화 : decimalFormat
import java.text.DecimalFormat;

public class Ex01 {

	public static void main(String[] args) {
		
		// Format 0 VS # -> 0은 빈자리에 0을 채워주고, #은 비워줌
		String pattern = "0,000.0000000";
		String pattern2 = "#,###.#######"; 
		String pattern3 = "0000";
		DecimalFormat df = new DecimalFormat(pattern3);
		//long num = 1000000000L;
		//double num = 1234.56789;
		long num = 20;
		String strNum1 = df.format(num);// 우리나라의 default pattern으로 출력.
		System.out.println(strNum1);
	}

}