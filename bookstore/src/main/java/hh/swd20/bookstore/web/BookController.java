package hh.swd20.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.bookstore.domain.BookRepository;
import hh.swd20.bookstore.domain.Book;

@Controller
public class BookController {
		@Autowired
		private BookRepository repository; 
	
		@RequestMapping(value="/index")
	    public String bookList(Model model) {	
	        model.addAttribute("books", repository.findAll());
	        return "index";
	    }
	  
	    @RequestMapping(value = "/add")
	    public String addBook(Model model){
	    	model.addAttribute("book", new Book());
	        return "addbook";
	    }     
	    
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String save(Book book){
	        repository.save(book);
	        return "redirect:index";
	    }    

}