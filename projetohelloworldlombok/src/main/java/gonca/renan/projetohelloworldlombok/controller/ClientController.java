package gonca.renan.projetohelloworldlombok.controller;

import gonca.renan.projetohelloworldlombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

@RestController
public class ClientController {

    @GetMapping("/clientes")
    public Client getClient() {

        Client client = new Client();
        client.setName("Renan");
        client.setLastName("Goncalves");
        client.setEmail("renan.g200@gmail.com");
        return client;
    }

    @GetMapping("/listaclientes")
    public ArrayList<Client> getListClient() {

        Client client1 = new Client();
        client1.setName("Renan");
        client1.setLastName("Goncalves");
        client1.setEmail("renan.g200@gmail.com");

        Client client2 = new Client();
        client2.setName("Marcos");
        client2.setLastName("Silva");
        client2.setEmail("MarcosSilva0@gmail.com");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        return clients;
    }
}
