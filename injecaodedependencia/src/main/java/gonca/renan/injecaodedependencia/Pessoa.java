package gonca.renan.injecaodedependencia;

import gonca.renan.injecaodedependencia.interfaces.IHumano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Renan
 * since 18/4/2020
 * version 1.0
 */

@Component
public class Pessoa {

    @Autowired
    @Qualifier("filho")
    private IHumano iHumano;

    public void execute() {
        iHumano.comunicar();
    }
}