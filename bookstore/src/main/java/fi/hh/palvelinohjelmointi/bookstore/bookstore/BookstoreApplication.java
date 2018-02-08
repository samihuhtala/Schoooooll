package fi.hh.palvelinohjelmointi.bookstore.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.Book;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner BookstoreDemo(BookRepository repository) {
		return (args) ->{
			log.info("Save couple of books");
			repository.save(new Book("Book", "somebody", 111, "pashdipahd", 12.3));
			repository.save(new Book("book1", "some1", 12, "asdasd", 11.2));
			
			log.info("fetch books");
			for(Book book : repository.findAll());
		
		};
	}
}
