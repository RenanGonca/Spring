package externalclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Renan
 * @since 18/4/2020
 * @version 1.0
 */

@Component
@Getter @Setter
public class ClassDAO {

    @Autowired
    private ClassJDBC objectJDBC;
}
