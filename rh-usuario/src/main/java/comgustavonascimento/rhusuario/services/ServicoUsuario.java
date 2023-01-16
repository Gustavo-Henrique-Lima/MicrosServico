package comgustavonascimento.rhusuario.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comgustavonascimento.rhusuario.entitys.Usuario;
import comgustavonascimento.rhusuario.repositorys.RepositorioUsuario;

@Service
public class ServicoUsuario {

	@Autowired
	private RepositorioUsuario repoUsu;
	
	public Usuario findById(Long id)
	{
		Usuario usuario=repoUsu.findById(id).get();
		return usuario;
	}
	
	public Usuario findByEmail(String email)
	{
		Usuario usuario=repoUsu.findByEmail(email);
		return usuario;
	}
}
