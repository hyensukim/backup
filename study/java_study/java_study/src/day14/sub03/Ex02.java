package day14.sub03;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ex02 {

	public static void main(String[] args) {
		Date date = new Date();
		String pattern = "yyyy-MM-dd HH:mm";
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		
		
	}

}
