package fi.hh.palvelinohjelmointi.bookstore.bookstore.domain;

public class Book {
private String title;
private String author;
private int year;
private String ISBN;
private double price;

public Book(){
	this.title = null;
	this.author = null;
	this.year = 0;
	this.ISBN = null;
	this.price = 0;
}
public Book (String title, String author, int year, String ISBN, double price){
	this.title = title;
	this.author = author;
	this.year = year;
	this.ISBN = ISBN;
	this.price = price;
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
	return "Book [title=" + title + ", author=" + author + ", year=" + year + ", ISBN=" + ISBN + ", price=" + price
			+ "]";
}

}
