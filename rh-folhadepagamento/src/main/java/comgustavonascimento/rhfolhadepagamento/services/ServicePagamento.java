package comgustavonascimento.rhfolhadepagamento.services;

import org.springframework.stereotype.Service;

import comgustavonascimento.rhfolhadepagamento.entitys.Pagamento;

@Service
public class ServicePagamento {
	
	public Pagamento getPagamento(Long idTrabalhador,int dias)
	{
		return new Pagamento("Gustavo",100.0,dias);
	}
}