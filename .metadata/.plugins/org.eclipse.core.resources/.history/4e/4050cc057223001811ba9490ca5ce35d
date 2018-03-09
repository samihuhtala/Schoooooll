package fi.hh.palvelinohjelmointi.bookstore.bookstore;

import java.util.List;
import  static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.Book;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.BookRepository;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.Category;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.CategoryRepository;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.User;
import fi.hh.palvelinohjelmointi.bookstore.bookstore.domain.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookstoreRepositoryTest {

	@Autowired
	private BookRepository brepo;
	
	@Autowired
	private CategoryRepository crepo;
	
	@Autowired
	private UserRepository urepo;
	
	@Test
	public void findByNameShouldReturnBook(){
		List<Book> books = brepo.findByTitle("cooking for dummies");
		assertThat(books).hasSize(1);
	}
	
	@Test
	public void deletebook(){
		List<Book> books = brepo.findByTitle("Deep Space 9");
		brepo.delete(books);
		assertThat(books).isNotNull();
		
	}
	@Test
	public void createBook() {
		Book book = new Book("test", "test", 1111,"test", 12.3, new Category("test"));
		brepo.save(book);
		assertThat(book.getId()).isNotNull();
	}
	
	@Test
	public void findByNameShouldReturnCategory() {
		List <Category> categories = crepo.findByName("cooking");
		assertThat(categories).hasSize(1);
	}
	
	@Test
	public void deleteCategory() {
		List<Category> categories = crepo.findByName("science");
		crepo.delete(categories);
		assertThat(categories).isNotNull();
	}
	
	@Test
	public void createCategory() {
		Category category = new Category("fantasy");
		crepo.save(category);
		assertThat(category.getName()).isNotEqualTo(category);
	}
	
	@Test
	public void findByNameShouldReturnUser() {
		User user = urepo.findByUsername("user1");
		assertThat(user).isNotNull();
	}
	
	@Test
	public void deleteUser() {
		User user = urepo.findByUsername("user1");
		urepo.delete(user);
		assertThat(user).isNotIn(user.getUsername());
	}
	
	@Test
	public void createUser() {
		User user = new User("user2", "$2a$04$eFmZjG0ZDr2w88SS5pUo3.Cl.wYS0DbUA6CZQcGYGJHPGEdNXI7xy", "user2@email.com", "USER");
		urepo.save(user);
		assertThat(user).isNotEqualTo(user.getUsername());
	}
}
