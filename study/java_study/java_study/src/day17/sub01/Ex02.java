package day17.sub01;

import java.util.*;
public class Ex02 {
	
	private static HashSet<Book> library = new HashSet<Book>();
	//Set
	public static void main(String[] args) {
//		HashSet<Book> library= new HashSet<Book>();
		library.add(new Book("책1","저자1","출판사1"));
		library.add(new Book("책2","저자2","출판사2"));
		library.add(new Book("책3","저자3","출판사3"));
		library.add(new Book("책3","저자3","출판사3"));//중복되어 출력됨.(물리적으로 다르면 중복이 아님)
		library.add(new Book("책4","저자4","출판사4"));
		for(Book book : library) {
		System.out.println(book);
		}
		
		//Set에는 별도로 조회하는 메서드가 없어서 이렇게 구현한다. 	
		System.out.println("----------책조회-----------");
		Book book3 = findBook("책3");
		System.out.println(book3);
	
	}
	
	private static Book findBook(String title) {
		
		for(Book book : library) {
			if(book.getTitle().equals(title)) {
				return book;
			}
		}
		
		return null; // 제목이 해당하는 책이 없는 경우
	}

}
