package science.mengxin.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import science.mengxin.spring5webapp.model.Book;

/**
 * User:    mengxin
 * Date:    19/03/2018
 * Project: spring5webapp
 * Package: science.mengxin.spring5webapp.repositories
 * Description: BookRepository.
 *
 * @author mengxin
 * @version 1.0
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
