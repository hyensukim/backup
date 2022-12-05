package day07;

public class Company {
	
	private static Company instance = new Company();// static 공유 개념
	
	private Company() {}
	
	public static Company getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println("출력!");
	}
}
