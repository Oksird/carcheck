package diploma.muzychenko.carcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("diploma.muzychenko.carcheck.config")
public class CarCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarCheckApplication.class, args);
	}

}
