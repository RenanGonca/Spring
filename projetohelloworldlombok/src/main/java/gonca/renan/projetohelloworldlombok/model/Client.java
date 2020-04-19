package gonca.renan.projetohelloworldlombok.model;

import lombok.*;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String email;
}
