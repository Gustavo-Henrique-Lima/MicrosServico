package comgustavonascimento.rhfolhadepagamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comgustavonascimento.rhfolhadepagamento.entitys.Pagamento;
import comgustavonascimento.rhfolhadepagamento.entitys.Trabalhador;
import comgustavonascimento.rhfolhadepagamento.feignclients.TrabalhadorFeignClient;

@Service
public class ServicePagamento {
	
	@Autowired
	private TrabalhadorFeignClient feignClientTrabalhador;
	
	public Pagamento getPagamento(Long idTrabalhador,int dias)
	{
		Trabalhador trabalhador=feignClientTrabalhador.findById(idTrabalhador).getBody();
		return new Pagamento(trabalhador.getNome(),trabalhador.getPagamentoDiario(),dias);
	}
}