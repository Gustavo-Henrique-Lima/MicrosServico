package comgustavonascimento.rhtrabalhador.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comgustavonascimento.rhtrabalhador.entitys.Trabalhador;
import comgustavonascimento.rhtrabalhador.services.ServiceTrabalhador;

@RestController
@RequestMapping(value="/trabalhadores")
public class ResourceTrabalhador {
	
	private static Logger logger = LoggerFactory.getLogger(ResourceTrabalhador.class);
	
	@Value("${test.config}")
	private String testConfig;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ServiceTrabalhador servTrab;
	
	@GetMapping(value="/configs")
	public ResponseEntity<Void> getConfigs() {
		logger.info("CONFIG = " + testConfig);
		return ResponseEntity.noContent().build();
	}		
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> findAll()
	{
		List<Trabalhador> trabalhadores=servTrab.findAll();
		return ResponseEntity.ok(trabalhadores);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long id)
	{
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Trabalhador trabalhador=servTrab.findById(id);
		return ResponseEntity.ok(trabalhador);
	}
}