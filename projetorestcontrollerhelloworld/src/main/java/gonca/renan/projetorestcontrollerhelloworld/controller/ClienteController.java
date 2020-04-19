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
public class ClienteController {

    @GetMapping("/arrayclientes")
    public ArrayList<Cliente> getClients() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Renan");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cledo");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        return clientes;
    }
}