package entidade;

import java.util.Date;
import java.util.List;

public class AgendaItem {
	
	private Double agendaId;
	private Date diaAgenda;
	private Servico servico;
	private List<String> horarios;
	private Profissional profissional;
	
	public Double getAgendaId() {
		return agendaId;
	}
	
	public void setAgendaId(Double agendaId) {
		this.agendaId = agendaId;
	}
	
	public Date getDiaAgenda() {
		return diaAgenda;
	}
	
	public void setDiaAgenda(Date diaAgenda) {
		this.diaAgenda = diaAgenda;
	}
	
	public Servico getServico() {
		return servico;
	}
	
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	
	public List<String> getHorarios() {
		return horarios;
	}
	
	public void setHorarios(List<String> horarios) {
		this.horarios = horarios;
	}
	
	public Profissional getProfissional() {
		return profissional;
	}
	
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	
	public AgendaItem(Double agendaId, Date diaAgenda, Servico servico, List<String> horarios,
			Profissional profissional) {
		super();
		this.agendaId = agendaId;
		this.diaAgenda = diaAgenda;
		this.servico = servico;
		this.horarios = horarios;
		this.profissional = profissional;
	}
			

	
	
}
