package patterns.design.state;

import patterns.design.strategy.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aprova(Orcamento orcamento) {}

	@Override
	public String toString() {
		return "Aprovado";
	}

	@Override
	public void reprova(Orcamento orcamento) {}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Finalizado());

	}

	@Override
	public double aplicaDescontoExtra(double valorOrcamento) {
		return valorOrcamento * 0.2;

	}

}
