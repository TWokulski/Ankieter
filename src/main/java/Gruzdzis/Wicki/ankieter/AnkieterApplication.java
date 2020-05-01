package Gruzdzis.Wicki.ankieter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AnkieterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnkieterApplication.class, args);
	}

}


@Controller
class HelloTest {
	@GetMapping("/leaf")
	String test() {
		return "leaf";
	}
}