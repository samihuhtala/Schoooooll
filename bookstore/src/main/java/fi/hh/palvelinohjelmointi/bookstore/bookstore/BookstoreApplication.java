package fi.hh.palvelinohjelmointi.bookstore.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.Book;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.BookRepository;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.Category;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner BookstoreDemo(BookRepository repository, CategoryRepository crepository) {
		return (args) ->{
			log.info("Save couple of books");
			
			crepository.save(new Category("science"));
			crepository.save(new Category("cooking"));
			
			repository.save(new Book("Deep Space 9", "some random dude", 2010, "pashdipahd", 12.3, crepository.findByName("science").get(0)));
			repository.save(new Book("cooking for dummies", "Ramsay", 2015, "asdasd", 20.2, crepository.findByName("cooking").get(0)));
			
			log.info("fetch books");
			for(Book book : repository.findAll());
		
		};
	}
}
