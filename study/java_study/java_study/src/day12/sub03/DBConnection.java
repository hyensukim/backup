package day12.sub03;

public class DBConnection implements AutoCloseable{
//자동 자원해제 - close() 메서드.
	@Override
	public void close() throws Exception {
		System.out.println("자원 해제");
	}

}
