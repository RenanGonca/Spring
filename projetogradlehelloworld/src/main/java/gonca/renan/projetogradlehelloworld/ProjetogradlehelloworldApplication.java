package gonca.renan.projetogradlehelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

@SpringBootApplication
public class ProjetogradlehelloworldApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjetogradlehelloworldApplication.class, args);

		System.out.println("Projeto com server TomCat");
	}

}
