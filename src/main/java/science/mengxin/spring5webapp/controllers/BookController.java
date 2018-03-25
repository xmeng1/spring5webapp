package science.mengxin.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import science.mengxin.spring5webapp.repositories.BookRepository;

/**
 * User:    mengxin
 * Date:    25/03/2018
 * Project: spring5webapp
 * Package: science.mengxin.spring5webapp.controllers
 * Description: BookController.
 *
 * @author mengxin
 * @version 1.0
 */

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
