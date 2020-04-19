package gonca.renan.projetorestcontrollerhelloworld.model;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */


public class Produto {

    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public Produto() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
