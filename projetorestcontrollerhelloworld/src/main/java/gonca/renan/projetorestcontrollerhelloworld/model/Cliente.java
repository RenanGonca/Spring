package gonca.renan.projetorestcontrollerhelloworld.model;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}