package day18;

import java.util.Objects;
public class Book implements Comparable<Book>{
	//Set - 중복 X, 순서 X
	
	//멤버변수(정보은닉)
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	//생성자
	public Book(String title, String author, String publisher, int price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	//getter & setter 메서드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//toString 메서드 오버라이드
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		int hashcode = Objects.hash(title,author,publisher);
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {// Object obj = new Book();
		if(obj instanceof Book) {
			
			Book book = (Book)obj;
			if(title.equals(book.title) && author.equals(book.author) && publisher.equals(book.publisher)){
				return true;
			}
			return false;
		}
		return super.equals(obj);
	}

	@Override
	//기준 하나만 가능한건가?, 호출하지도 않았는데 어떻게 되는것인가
	public int compareTo(Book o) {
//		String bookTitle = o.getTitle();
//		int c = title.compareTo(bookTitle)*-1;// 오름차순 -> 내림차순(오름차순 + (-1))
//		System.out.println(c);
//		return c;
		
		Integer _price = price;
		System.out.println(_price);
		
		Integer hash = title.hashCode() + price;
		Integer hash2 = o.getTitle().hashCode() + o.price; 
		return hash.compareTo(hash2)*-1;
		
	}
	

}
