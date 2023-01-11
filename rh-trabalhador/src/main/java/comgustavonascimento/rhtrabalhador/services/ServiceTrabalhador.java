package comgustavonascimento.rhtrabalhador.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comgustavonascimento.rhtrabalhador.entitys.Trabalhador;
import comgustavonascimento.rhtrabalhador.repositorys.RepositorioTrabalhador;
import comgustavonascimento.rhtrabalhador.services.exceptions.ResourceNotFoundException;

@Service
public class ServiceTrabalhador {

	@Autowired
	private RepositorioTrabalhador repoTrab;
	
	public List<Trabalhador> findAll()
	{
		return repoTrab.findAll();
	}
	
	public Trabalhador findById(Long id)
	{
		Optional<Trabalhador> trabalhador=repoTrab.findById(id);
		return trabalhador.orElseThrow(()->new ResourceNotFoundException(id));
	}
}