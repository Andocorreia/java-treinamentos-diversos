package patterns.design.strategy;

import java.util.ArrayList;
import java.util.List;

import patterns.design.state.EmAprovacao;
import patterns.design.state.EstadoDeUmOrcamento;

public class Orcamento {
	
	
	private EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento() {
		estadoAtual = new EmAprovacao();
	}

	private List<OrcamentoItens> itens = new ArrayList<OrcamentoItens>();

	public double getValor() {
		double valorOrcamento = itens.stream().mapToDouble(OrcamentoItens::getValorTotal).sum();
		return valorOrcamento - this.aplicaDescontoExtra(valorOrcamento);
	}
	
	public void adicionaItem(OrcamentoItens itens) {
		this.itens.add(itens);		
	}
	
	public List<OrcamentoItens> getItens() {
		return this.itens;
	}
	
	private double aplicaDescontoExtra(double valorOrcamento) {
		return estadoAtual.aplicaDescontoExtra(valorOrcamento);
	}
	
	public void setEstadoAtual(EstadoDeUmOrcamento estado) {
		estadoAtual = estado;
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
	
	public String estadoAtual() {
		return estadoAtual.toString();
	}


}

