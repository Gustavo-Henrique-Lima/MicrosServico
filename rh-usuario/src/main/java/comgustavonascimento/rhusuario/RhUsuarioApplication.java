package comgustavonascimento.rhusuario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class RhUsuarioApplication implements CommandLineRunner{

	//@Autowired
	//private BCryptPasswordEncoder encoder;
	
	public static void main(String[] args) {
		SpringApplication.run(RhUsuarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		//System.out.println("Senha cript = "+encoder.encode("123456"));
	}
}