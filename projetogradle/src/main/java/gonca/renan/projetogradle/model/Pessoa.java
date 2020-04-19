package gonca.renan.projetogradle.model;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

public class Pessoa {

    private String name;

    public Pessoa() {

    }

    public Pessoa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                '}';
    }
}
