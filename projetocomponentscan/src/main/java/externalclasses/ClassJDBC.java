package externalclasses;

import org.springframework.stereotype.Component;

/**
 * @author Renan
 * @since 18/4/2020
 * @version 1.0
 */

@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("conexão JDBC!");
    }

}
