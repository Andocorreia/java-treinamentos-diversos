package patterns.design.memento;

import java.time.LocalDate;

public class Contrato {

	private LocalDate data;
	private String cliente;
	private TipoContrato tipoContrato;

	public LocalDate getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public Contrato(LocalDate data, String cliente, TipoContrato tipoContrato) {
		this.data = data;
		this.cliente = cliente;
		this.tipoContrato = tipoContrato;
	}
	
	public void avanca() {
		if(this.tipoContrato == TipoContrato.NOVO) this.tipoContrato = TipoContrato.EM_ANDAMENTO;
		else if(this.tipoContrato == TipoContrato.EM_ANDAMENTO) this.tipoContrato = TipoContrato.ACERTADO;
		else if(this.tipoContrato == TipoContrato.ACERTADO) this.tipoContrato = TipoContrato.CONCLUIDO;
	}
	
	public Estado salvaEstado() {
		return new Estado(new Contrato(this.data, this.cliente, this.tipoContrato));
	}

}
