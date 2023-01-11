package comgustavonascimento.rhfolhadepagamento.entitys;

import java.io.Serializable;
import java.util.Objects;

public class Trabalhador implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private Double pagamentoDiario;
	
	public Trabalhador()
	{
	}

	public Trabalhador(Long id, String nome, Double pagamentoDiario) 
	{
		super();
		this.id = id;
		this.nome = nome;
		this.pagamentoDiario = pagamentoDiario;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public Double getPagamentoDiario() 
	{
		return pagamentoDiario;
	}

	public void setPagamentoDiario(Double pagamentoDiario) 
	{
		this.pagamentoDiario = pagamentoDiario;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabalhador other = (Trabalhador) obj;
		return Objects.equals(id, other.id);
	}
}