package comgustavonascimento.rhfolhadepagamento.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comgustavonascimento.rhfolhadepagamento.entitys.Pagamento;
import comgustavonascimento.rhfolhadepagamento.services.ServicePagamento;

@RestController
@RequestMapping(value="/pagamentos")
public class ResourcePagamento {
	
	@Autowired
	private ServicePagamento servPag;
	
	@GetMapping(value="/{idTrabalhador}/dias/{dias}")
	public ResponseEntity<Pagamento> findPagamento(@PathVariable Long idTrabalhador,@PathVariable Integer dias)
	{
		Pagamento pagamento=servPag.getPagamento(idTrabalhador, dias);
		return ResponseEntity.ok(pagamento);
	}
}