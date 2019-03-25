package hh.swd20.bookstore;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import hh.swd20.bookstore.domain.CategoryRepository;
import hh.swd20.bookstore.domain.Category;
import hh.swd20.bookstore.domain.Book;
import hh.swd20.bookstore.domain.BookRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository repository1;
    
    @Autowired
    private CategoryRepository repository2;

    //Book testaus
    @Test
    public void findByAuthorShouldReturnBook() {
        List<Book> books = repository1.findByAuthor("R. Rantala & T. Milonoff");
        
        assertThat(books).hasSize(1);
        assertThat(books.get(0).getTitle()).isEqualTo("Selviytymisopas: maailma muuttuu...");
    }
    
    //Category testaus
    @Test
    public void findByNameShouldReturnCategory() {
        List<Category> categories = repository2.findByName("Science");
        
        assertThat(categories).hasSize(1);
        assertThat(categories.get(0).getName()).isEqualTo("Science");
    }
    
    //Kirjan lisäys
    @Test
    public void addBook() {
    	Book book = new Book("H.P. Lovecraft", "The Complete Fiction of H.P. Lovecraft",9781631060014L, 2014, 25.60, new Category("Fiction"));
    	repository1.save(book);
    	assertThat(book.getId()).isNotNull();
    }
    
    //Kirjan poisto
    @Test
    public void deleteBook() {
    	long bookId = 4;
    	repository1.deleteById(bookId);
    }
    
    //Kategorian poisto
    @Test
    public void deleteCategory() {
    	long categoryId = 1;
    	repository2.deleteById(categoryId);
    }
    
    //Kategorian lisäys
    @Test
    public void addCategory() {
    	Category category = new Category("Fantasy");
    	repository2.save(category);
    	assertThat(category.getCategoryid()).isNotNull();
    }
    
    
    
}