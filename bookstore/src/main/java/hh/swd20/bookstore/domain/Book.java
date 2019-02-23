package hh.swd20.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Book {
	// attribuutit
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	private int year;
	private long isbn;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="categoryid")
	private Category category;
	
	// konstruktorit
	public Book() { 
		// parametritön konstruktori
	}
	
	public Book(String author, String title, long isbn, int year, double price, Category category) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
		this.category = category;
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
	public void setYear(int year) {
		this.year = year;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setCategory(Category category) {
		this.category = category;
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
	public int getYear() {
		return year;
	}
	public long getIsbn() {
		return isbn;
	}
	public double getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}

	// muut metodit, 0
	@Override
	public String toString() {
		if (this.category != null)
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price
					+ "category =" + this.getCategory() + "]";
		else
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price
				+ "]";
	}
	
}
