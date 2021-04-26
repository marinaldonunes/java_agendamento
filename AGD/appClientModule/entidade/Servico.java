package entidade;

public class Servico {
	
	private Integer servidoId;
	private String nomeServico;
	
	public Integer getServidoId() {
		return servidoId;
	}
	
	public void setServidoId(Integer servidoId) {
		this.servidoId = servidoId;
	}
	
	public String getNomeServico() {
		return nomeServico;
	}
	
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	
	@Override
	public String toString() {
		return "Servico [servidoId=" + servidoId + ", nomeServico=" + nomeServico + "]";
	}
	
	public Servico(Integer servidoId, String nomeServico) {
		super();
		this.servidoId = servidoId;
		this.nomeServico = nomeServico;
	}
	
	

}
