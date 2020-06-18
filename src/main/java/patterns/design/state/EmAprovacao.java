package patterns.design.state;

import patterns.design.strategy.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Reprovado());

	}
	
	@Override
	public String toString() {
		return "Em Aprovacao";
	}


	@Override
	public void finaliza(Orcamento orcamento) {}

	@Override
	public double aplicaDescontoExtra(double valorOrcamento) {
		return valorOrcamento * 0.1;

	}

}
