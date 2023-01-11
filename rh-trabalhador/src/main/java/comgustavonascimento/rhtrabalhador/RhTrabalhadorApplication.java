package comgustavonascimento.rhtrabalhador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RhTrabalhadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhTrabalhadorApplication.class, args);
	}

}
