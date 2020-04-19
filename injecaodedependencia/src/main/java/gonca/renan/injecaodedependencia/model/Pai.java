package gonca.renan.injecaodedependencia.model;

import gonca.renan.injecaodedependencia.interfaces.IHumano;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Renan
 * since 18/4/2020
 * version 1.0
 */

@Component
@Qualifier("pai")
public class Pai implements IHumano {

    @Override
    public void comunicar() {
        System.out.println("Estou trabalhando Demaiss!!!");
    }
}
