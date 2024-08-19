package my_fitness_app;

import org.springframework.boot.SpringApplication;

public class TestMyfitnessApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyfitnessApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
