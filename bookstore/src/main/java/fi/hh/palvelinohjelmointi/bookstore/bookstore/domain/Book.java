package fi.hh.palvelinohjelmointi.bookstore.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
private String title;
private String author;
private int year;
private String ISBN;
private double price;
@ManyToOne
@JsonIgnore
@JoinColumn(name ="categoryid")
private Category category;

public Book(){}
	

public Book (String title, String author, int year, String ISBN, double price, Category category){
	super();
	this.title = title;
	this.author = author;
	this.year = year;
	this.ISBN = ISBN;
	this.price = price;
	this.category = category;
}
public void setCategory(Category category) {
	this.category = category;

}

public Category getCategory() {
	return category;

}


public Long getId() {
	return id;
}
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
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public void setPrice(double price) {
	this.price = price;
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
public String getISBN() {
	return ISBN;
}
public double getPrice() {
	return price;
}
@Override
public String toString() {
	if (this.category != null)
	return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", ISBN=" + ISBN + ", price=" + price + ", category=" + this.getCategory() + "]";
	else
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", ISBN=" + ISBN+ ", price=" + price +"]";
}

}
