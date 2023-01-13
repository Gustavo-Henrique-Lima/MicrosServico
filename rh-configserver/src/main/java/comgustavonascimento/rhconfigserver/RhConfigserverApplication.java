package comgustavonascimento.rhconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RhConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhConfigserverApplication.class, args);
	}

}
