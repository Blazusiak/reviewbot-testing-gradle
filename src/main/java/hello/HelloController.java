package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
	//String s = null;
	//s.length();
        return "Greetings from Spring Boot!";
    }

}
