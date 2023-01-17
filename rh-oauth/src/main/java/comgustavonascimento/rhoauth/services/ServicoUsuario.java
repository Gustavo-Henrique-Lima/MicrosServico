package comgustavonascimento.rhoauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comgustavonascimento.rhoauth.entitys.Usuario;
import comgustavonascimento.rhoauth.feignclients.UsuarioFeignClient;

@Service
public class ServicoUsuario {
	
	private static Logger logger = LoggerFactory.getLogger(ServicoUsuario.class);
	
	@Autowired
	private UsuarioFeignClient userFeign;
	
	public Usuario findByEmail(String email)
	{
		Usuario usuario=userFeign.findByEmail(email).getBody();
		if(usuario.equals(null))
		{
			logger.error("Email não encontrado: "+email);
			throw new IllegalArgumentException("Email não encontrado");
		}
		logger.info("Email encontrado: "+email);
		return usuario;
	}
}
