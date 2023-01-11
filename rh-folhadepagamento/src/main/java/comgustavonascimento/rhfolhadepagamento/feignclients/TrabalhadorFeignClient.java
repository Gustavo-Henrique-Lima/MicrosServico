package comgustavonascimento.rhfolhadepagamento.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import comgustavonascimento.rhfolhadepagamento.entitys.Trabalhador;


@Component
@FeignClient(name="rh-trabalhador",url="localhost:8081",path="/trabalhadores")
public interface TrabalhadorFeignClient {

	@GetMapping(value="/{id}")
	ResponseEntity<Trabalhador> findById(@PathVariable Long id);
}