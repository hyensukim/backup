package day12.sub03;

public class Ex02 {

	public static void main(String[] args) {
		
		try(DBConnection conn = new DBConnection()){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
