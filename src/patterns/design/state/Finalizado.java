package patterns.design.state;

import patterns.design.strategy.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aprova(Orcamento orcamento) {}

	@Override
	public void reprova(Orcamento orcamento) {}
	
	@Override
	public String toString() {
		return "Finalizado";
	}


	@Override
	public void finaliza(Orcamento orcamento) {	}

	@Override
	public double aplicaDescontoExtra(double valorOrcamento) {
		return 0;
	}

}
