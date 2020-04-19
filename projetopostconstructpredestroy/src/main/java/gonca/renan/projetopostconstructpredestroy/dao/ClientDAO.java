package gonca.renan.projetopostconstructpredestroy.dao;

import gonca.renan.projetopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Renan
 * since 18/4/2020
 * version 1.0
 */

@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Obejto Criado.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Obejto Finalizado.");
    }
}