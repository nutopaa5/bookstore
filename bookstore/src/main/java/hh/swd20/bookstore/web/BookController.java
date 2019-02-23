package hh.swd20.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.bookstore.domain.CategoryRepository;
import hh.swd20.bookstore.domain.Category;
import hh.swd20.bookstore.domain.BookRepository;
import hh.swd20.bookstore.domain.Book;

@Controller
public class BookController {
		@Autowired
		private BookRepository repository; 
		
		@Autowired
		private CategoryRepository crepository; 
	
		@RequestMapping(value="/booklist", method = RequestMethod.GET)
	    public String bookList(Model model) {	
	        model.addAttribute("books", repository.findAll());
	        return "booklist";
	    }
	    
		@RequestMapping(value = "/addbook")
	    public String addBook(Model model){
	    	model.addAttribute("book", new Book());
	    	model.addAttribute("categories", crepository.findAll());
	        return "addbook";
	    }   
		
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String save(Book book){
	        repository.save(book);
	        return "redirect:booklist";
	    }

	    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	    public String deleteBook(@PathVariable("id") Long bookId, Model model) {
	    	repository.deleteById(bookId);
	        return "redirect:../booklist";
	    }
	    
	    @RequestMapping(value = "/edit/{id}")
	    public String editBook(@PathVariable("id") Long bookId, Model model) {
	    	model.addAttribute("book", repository.findById(bookId));
	    	model.addAttribute("categories", crepository.findAll());
	        return "edit";
	    }
	    
}