package gonca.renan.projetohelloworldlombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Renan
 * @since 19/4/2020
 * @version 1.0
 */

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Let's go with Lombok!";
    }
}
