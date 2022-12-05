package day12.sub01;

public class Ex01 {

	public static void main(String[] args) {
		MemberLogin memberLogin = new MemberLogin();
		try {
		memberLogin.login("user01", "1234"); // 예외를 전가 받았으므로 try-catch해줘야 함.
		}catch(Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
		
		
	}

}
