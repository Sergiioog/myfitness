package my_fitness_general_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Exercise {
	
	@GetMapping("/greeting")
	public String sayHello() {
		return "Hello from Spring Boot!";
	}

}
