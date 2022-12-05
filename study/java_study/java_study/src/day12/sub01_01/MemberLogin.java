package day12.sub01_01;

public class MemberLogin {
	public void login(String userId, String userPass) {
		if(!userId.equals("user01")) {
			throw new MemberNotFoundException("등록되지 않은 회원입니다.");
		}
		
		if(!userPass.equals("1234")) {
			throw new PasswordIncorrectException("잘못된 비밀번호 입니다.");
		}
		
		System.out.println("로그인 성공입니다!");
		
	}
}
