package gonca.renan.projetopostconstructpredestroy;

import gonca.renan.projetopostconstructpredestroy.dao.ClientDAO;
import gonca.renan.projetopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Renan
 * since 18/4/2020
 * version 1.0
 */

@SpringBootApplication
public class ProjetopostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ProjetopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Renan Gonçalves"));

		System.out.println("ClienteDAO: " + clientDAO);
		System.out.println("Objeto client dentro do DAO: " + clientDAO.getClient());
	}

}
