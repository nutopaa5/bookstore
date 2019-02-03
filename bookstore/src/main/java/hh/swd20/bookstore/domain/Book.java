package hh.swd20.bookstore.domain;

public class Book {
	
	// attribuutit
	private String title;
	private String author;
	private int year;
	private int isbn;
	private int price;
	
	// konstruktorit
	public Book() { // parametritön konstruktori
		super();
	}
	
	public Book(String title, String author, int year, int isbn, int price) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}
	
	// setterit
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getterit
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
	public int getIsbn() {
		return isbn;
	}
	public int getPrice() {
		return price;
	}

	// muut metodit, 0
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price
				+ "]";
	}
	
}
