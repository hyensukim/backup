package day15;
//SimpleDateFormat 예제
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Ex01 {

	public static void main(String[] args)throws ParseException {
		Date date = new Date();
		System.out.println(date); // date.toString() 재정의
		
		//Date가 출력되는 형식을 다양하게 하기 위한 방법
		String pattern = "yy년 MM월 dd일 HH시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		//format(임의의 형식으로 변경)
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
		
		//parse(매개변수 형식으로 복귀)
		String pattern2 = "yyyy-MM-dd HH:mm:ss";
		String dateStr2 = "2022-10-15 12:00:30";
		SimpleDateFormat sdf2 = new  SimpleDateFormat(pattern2);
		Date date2 = sdf2.parse(dateStr2);
		System.out.println(date2);
	}

}
