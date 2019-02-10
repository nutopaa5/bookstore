package hh.swd20.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.bookstore.domain.BookRepository;
import hh.swd20.bookstore.domain.Book;

@Controller
public class BookController {
		@Autowired
		private BookRepository repository; 
	
		 @RequestMapping(value = "/save", method = RequestMethod.POST)
		    public String save(Book book){
		        repository.save(book);
		        return "redirect:index";
		    }    
		
}