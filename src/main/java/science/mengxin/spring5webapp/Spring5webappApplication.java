package science.mengxin.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableAutoConfiguration(exclude = {
//         JndiConnectionFactoryAutoConfiguration.class,
//         DataSourceAutoConfiguration.class,
//         HibernateJpaAutoConfiguration.class,
//         JpaRepositoriesAutoConfiguration.class,
//         DataSourceTransactionManagerAutoConfiguration.class})
@SpringBootApplication
public class Spring5webappApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5webappApplication.class, args);
    }
}
