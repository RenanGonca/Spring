package gonca.renan.projetoescopo;

import gonca.renan.projetoescopo.dao.ClassDAO;
import gonca.renan.projetoescopo.dao.ClassJDBC;
import gonca.renan.projetoescopo.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Renan
 * @since 18/4/2020
 * @version 1.0
 */

@SpringBootApplication
public class ProjetoescopoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ProjetoescopoApplication.class, args);

		//Design pattern - padrão de projeto -SINGLETON
		ClassDAO classDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO classDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("classDAO1: " + classDAO1);
		System.out.println("objJDBC1: " + classDAO1.getObjetctJDBC());

		System.out.println("classDAO2: " + classDAO2);
		System.out.println("objJDBC2: " + classDAO2.getObjetctJDBC());

		Client client = new Client();
		System.out.println(client);

		Client client1 = new Client();
		System.out.println(client1);
	}

}
