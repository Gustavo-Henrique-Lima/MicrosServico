package comgustavonascimento.rhusuario.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import comgustavonascimento.rhusuario.entitys.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	Usuario findByEmail(String email);
}