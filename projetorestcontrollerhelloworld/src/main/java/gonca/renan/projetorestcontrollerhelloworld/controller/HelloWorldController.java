package gonca.renan.projetorestcontrollerhelloworld.controller;

import gonca.renan.projetorestcontrollerhelloworld.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Let's go!";
    }

    @GetMapping("/clientes")
    public Cliente getClient() {

        Cliente cliente = new Cliente();
        cliente.setNome("Renan");

        return cliente;
    }
}