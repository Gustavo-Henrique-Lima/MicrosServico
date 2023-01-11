package comgustavonascimento.rheurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RhEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhEurekaserverApplication.class, args);
	}
}