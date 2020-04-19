package gonca.renan.projetocomponentscan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Renan
 * @since 18/4/2020
 * @version 1.0
 */

@SpringBootApplication
@ComponentScan("externalclasses") //importar e procurar os Beans desta classe....
public class ProjetocomponentscanApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ProjetocomponentscanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC dentro do DAO: " + objectDAO1.getObjectJDBC());
	}

}
