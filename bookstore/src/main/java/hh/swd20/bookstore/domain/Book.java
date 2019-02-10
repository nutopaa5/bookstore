package hh.swd20.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	// attribuutit
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	private String year;
	private String isbn;
	private String price;
	
	// konstruktorit
	public Book() { 
		// parametritön konstruktori
	}
	
	public Book(String author, String title, String isbn, String year, String price) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
	}
	
	// setterit
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	// getterit
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getYear() {
		return year;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getPrice() {
		return price;
	}

	// muut metodit, 0
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price
				+ "]";
	}
	
}
