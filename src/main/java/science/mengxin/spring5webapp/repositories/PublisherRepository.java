package science.mengxin.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import science.mengxin.spring5webapp.model.Publisher;

/**
 * User:    mengxin
 * Date:    21/03/2018
 * Project: spring5webapp
 * Package: science.mengxin.spring5webapp.repositories
 * Description: PublisherRepository.
 *
 * @author mengxin
 * @version 1.0
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
