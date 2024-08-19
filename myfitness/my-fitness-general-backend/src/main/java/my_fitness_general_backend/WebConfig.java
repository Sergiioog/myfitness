package my_fitness_general_backend;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer { //Interfaz que permite configurar MVC

	@Override
	public void addCorsMappings(CorsRegistry registry) { //Metodo que permite el CORS Mapping
			registry.addMapping("/**")
			.allowedOrigins("http://localhost:4200")
			.allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE")
			.allowedHeaders("*");
	}

}
