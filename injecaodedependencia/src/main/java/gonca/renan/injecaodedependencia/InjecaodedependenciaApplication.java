package gonca.renan.injecaodedependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Renan
 * since 18/4/2020
 * version 1.0
 */

@SpringBootApplication
public class InjecaodedependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(InjecaodedependenciaApplication.class, args);

		Pessoa pessoa = applicationContext.getBean(Pessoa.class);
		pessoa.execute();
	}
}