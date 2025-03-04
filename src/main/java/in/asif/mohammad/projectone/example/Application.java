package in.asif.mohammad.projectone.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

@RestController
@RequestMapping("/api")
class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World! How Are You?";
	}

	@GetMapping("/greet")
	public String greetUser(@RequestParam(defaultValue = "Guest") String name) {
		return "Hello, " + name + "! Welcome to our API.";
	}
}
