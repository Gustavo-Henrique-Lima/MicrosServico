package comgustavonascimento.rhoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comgustavonascimento.rhoauth.entitys.Usuario;


@Component
@FeignClient(name="rh-usuario",path="/usuarios")
public interface UsuarioFeignClient {

	@GetMapping(value="/search")
	ResponseEntity<Usuario> findByEmail(@RequestParam String email);
}
