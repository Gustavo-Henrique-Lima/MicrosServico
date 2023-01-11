package comgustavonascimento.rhtrabalhador.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private ServiceTrabalhador servTrab;
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> findAll()
	{
		List<Trabalhador> trabalhadores=servTrab.findAll();
		return ResponseEntity.ok(trabalhadores);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Trabalhador> findById(@PathVariable Long id)
	{
		Trabalhador trabalhador=servTrab.findById(id);
		return ResponseEntity.ok(trabalhador);
	}
}