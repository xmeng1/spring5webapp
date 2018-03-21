package science.mengxin.spring5webapp.boostrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import science.mengxin.spring5webapp.model.Author;
import science.mengxin.spring5webapp.model.Book;
import science.mengxin.spring5webapp.model.Publisher;
import science.mengxin.spring5webapp.repositories.AuthorRepository;
import science.mengxin.spring5webapp.repositories.BookRepository;
import science.mengxin.spring5webapp.repositories.PublisherRepository;

/**
 * User:    mengxin
 * Date:    19/03/2018
 * Project: spring5webapp
 * Package: science.mengxin.spring5webapp.boostrap
 * Description: DevBootstrap.
 *
 * @author mengxin
 * @version 1.0
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository,
            BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        Publisher pub1 = new Publisher("pub1", "Bei Jing");
        ddd.setPublisher(pub1);

        publisherRepository.save(pub1);
        authorRepository.save(eric);
        bookRepository.save(ddd);




        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        Publisher pub2 = new Publisher("pub2", "London");
        noEJB.setPublisher(pub2);

        publisherRepository.save(pub2);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
