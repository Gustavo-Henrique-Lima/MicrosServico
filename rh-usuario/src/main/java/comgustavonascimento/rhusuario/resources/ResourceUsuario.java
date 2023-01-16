package comgustavonascimento.rhusuario.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import comgustavonascimento.rhusuario.entitys.Usuario;
import comgustavonascimento.rhusuario.services.ServicoUsuario;

@RestController
@RequestMapping(value="/usuarios")
public class ResourceUsuario {

	@Autowired
	private ServicoUsuario servUsu;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id)
	{
		Usuario usuario=servUsu.findById(id);
		return ResponseEntity.ok(usuario);
	}
	
	@GetMapping(value="/search")
	public ResponseEntity<Usuario> findByEmail(@RequestParam String email )
	{
		Usuario usuario=servUsu.findByEmail(email);
		return ResponseEntity.ok(usuario);
	}
}