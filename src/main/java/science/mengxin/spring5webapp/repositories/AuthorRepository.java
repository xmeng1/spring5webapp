package science.mengxin.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import science.mengxin.spring5webapp.model.Author;

/**
 * User:    mengxin
 * Date:    19/03/2018
 * Project: spring5webapp
 * Package: science.mengxin.spring5webapp.repositories
 * Description: AuthorRepository.
 *
 * @author mengxin
 * @version 1.0
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{

}
