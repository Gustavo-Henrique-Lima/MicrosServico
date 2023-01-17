package comgustavonascimento.rhoauth.entitys;

import java.io.Serializable;
import java.util.Objects;

public class Papel implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nomePapel;
	
	public Papel()
	{
	}

	public Papel(Long id, String nomePapel) 
	{
		super();
		this.id = id;
		this.nomePapel = nomePapel;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getNomePapel() 
	{
		return nomePapel;
	}

	public void setNomePapel(String nomePapel) 
	{
		this.nomePapel = nomePapel;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(nomePapel);
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
		Papel other = (Papel) obj;
		return Objects.equals(nomePapel, other.nomePapel);
	}
}