package gonca.renan.projetorestcontrollerhelloworld.controller;

import gonca.renan.projetorestcontrollerhelloworld.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    public String getProducts() {
        return "Area do produto!";
    }

    @GetMapping("/produto")
    public Produto getProduct() {
        Produto produto = new Produto();
        produto.setDescricao("Nescau");
        return produto;
    }
}