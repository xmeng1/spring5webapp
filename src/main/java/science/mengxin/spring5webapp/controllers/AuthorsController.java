package science.mengxin.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import science.mengxin.spring5webapp.repositories.AuthorRepository;

/**
 * User:    mengxin
 * Date:    25/03/2018
 * Project: spring5webapp
 * Package: science.mengxin.spring5webapp.controllers
 * Description: AuthorsController.
 *
 * @author mengxin
 * @version 1.0
 */

@Controller
public class AuthorsController {

    private AuthorRepository authorRepository;

    public AuthorsController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
