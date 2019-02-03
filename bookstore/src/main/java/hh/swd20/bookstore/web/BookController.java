package hh.swd20.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hh.swd20.bookstore.domain.Book;

@Controller
public class BookController {
	
		// lähettää selaimeen tyhjän autolomakkeen
		@RequestMapping(value="/index", method=RequestMethod.GET)
		public String uusiKirja(Model model, 
		@RequestParam(value="title") String title,
		@RequestParam(value="author") String author,
		@RequestParam(value="year") int year,
		@RequestParam(value="isbn") int isbn,
		@RequestParam(value="price") int price
		) {
			
			// luodaan uusi tyhjä Book-olio
			Book book1 = new Book();
			model.addAttribute("title", title);
			model.addAttribute("author", author);
			model.addAttribute("year", year);
			model.addAttribute("isbn", isbn);
			model.addAttribute("price", price);
			model.addAttribute("book", book1);
			return "index"; // index.html (Thymeleaf template)
		}
}