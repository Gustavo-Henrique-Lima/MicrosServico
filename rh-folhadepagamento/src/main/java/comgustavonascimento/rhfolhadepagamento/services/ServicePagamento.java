package comgustavonascimento.rhfolhadepagamento.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import comgustavonascimento.rhfolhadepagamento.entitys.Pagamento;
import comgustavonascimento.rhfolhadepagamento.entitys.Trabalhador;

@Service
public class ServicePagamento {
	
	@Value("${rh-trabalhador.host}")
	private String trabalhadorHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Pagamento getPagamento(Long idTrabalhador,int dias)
	{
		Map<String,String> uriVariaveis=new HashMap<>();
		uriVariaveis.put("id",""+idTrabalhador);
		Trabalhador trabalhador=restTemplate.getForObject(trabalhadorHost+"/trabalhadores/{id}",Trabalhador.class,uriVariaveis);
		return new Pagamento(trabalhador.getNome(),trabalhador.getPagamentoDiario(),dias);
	}
}