package my_fitness_general_backend;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public Application() {
	
	}

	public static void main(String[] args) {
		System.out.println("El array contiene estos numeros -> " + Arrays.toString(metodoDePrueba()));
		
	}
	
	public static int[] metodoDePrueba() {
		
		 int [] arrayNumeros  = {1,2,3,4};
		 return arrayNumeros;
	}
	
}
