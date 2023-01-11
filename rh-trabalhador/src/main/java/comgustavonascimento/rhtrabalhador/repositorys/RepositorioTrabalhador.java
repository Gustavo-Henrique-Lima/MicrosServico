package comgustavonascimento.rhtrabalhador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import comgustavonascimento.rhtrabalhador.entitys.Trabalhador;

public interface RepositorioTrabalhador extends JpaRepository<Trabalhador,Long>{

}