package entidade;

import java.util.List;

public class Profissional {
	private String nomeProfissional;
	private String sobrenomeProfissional;
	private String nrRegistro;
	private String UfRegistro;
	private List<Contato> contatos;
	public String getNomeProfissional() {
		return nomeProfissional;
	}
	
	public void setNomeProfissional(String nomeProfissional) {
		this.nomeProfissional = nomeProfissional;
	}
	
	public String getSobrenomeProfissional() {
		return sobrenomeProfissional;
	}
	
	public void setSobrenomeProfissional(String sobrenomeProfissional) {
		this.sobrenomeProfissional = sobrenomeProfissional;
	}
	
	public String getNrRegistro() {
		return nrRegistro;
	}
	
	public void setNrRegistro(String nrRegistro) {
		this.nrRegistro = nrRegistro;
	}
	
	public String getUfRegistro() {
		return UfRegistro;
	}
	
	public void setUfRegistro(String ufRegistro) {
		UfRegistro = ufRegistro;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public Profissional(String nomeProfissional, String sobrenomeProfissional, String nrRegistro, String ufRegistro) {
		super();
		this.nomeProfissional = nomeProfissional;
		this.sobrenomeProfissional = sobrenomeProfissional;
		this.nrRegistro = nrRegistro;
		UfRegistro = ufRegistro;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UfRegistro == null) ? 0 : UfRegistro.hashCode());
		result = prime * result + ((nrRegistro == null) ? 0 : nrRegistro.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profissional other = (Profissional) obj;
		if (UfRegistro == null) {
			if (other.UfRegistro != null)
				return false;
		} else if (!UfRegistro.equals(other.UfRegistro))
			return false;
		if (nrRegistro == null) {
			if (other.nrRegistro != null)
				return false;
		} else if (!nrRegistro.equals(other.nrRegistro))
			return false;
		return true;
	}

	
	
}
