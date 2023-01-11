package comgustavonascimento.rhfolhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name="rh-trabalhador")
@EnableFeignClients
@SpringBootApplication
public class RhFolhadepagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhFolhadepagamentoApplication.class, args);
	}

}
