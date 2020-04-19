package gonca.renan.injecaodedependencia.model;

import gonca.renan.injecaodedependencia.interfaces.IHumano;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Renan
 * since 18/4/2020
 * version 1.0
 */

@Component
@Primary
@Qualifier("filho")
public class Filho implements IHumano {

    @Override
    public void comunicar() {
        System.out.println("Só fico jogando a Tarde Inteira.");
    }

}
