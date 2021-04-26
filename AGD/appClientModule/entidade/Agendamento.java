package entidade;

public class Agendamento {
	
	private AgendaItem agenda;
	private Pessoa pessoa;
	
	public AgendaItem getAgenda() {
		return agenda;
	}
	
	public void setAgenda(AgendaItem agenda) {
		this.agenda = agenda;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Agendamento(AgendaItem agenda, Pessoa pessoa) {
		super();
		this.agenda = agenda;
		this.pessoa = pessoa;
	}


}
