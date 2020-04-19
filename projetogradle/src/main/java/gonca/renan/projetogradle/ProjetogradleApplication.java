package gonca.renan.projetogradle;

import gonca.renan.projetogradle.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

@SpringBootApplication
public class ProjetogradleApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjetogradleApplication.class, args);

		System.out.println("Hello World SpringBOOT com Gradle");

		Pessoa pessoa = new Pessoa();
		pessoa.setName("Renan");
		System.out.println(pessoa);

	}

}
