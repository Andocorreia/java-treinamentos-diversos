package patterns.design.state;

import patterns.design.strategy.Orcamento;

public interface EstadoDeUmOrcamento {
	void aprova(Orcamento orcamento);
	void reprova(Orcamento orcamento);
	void finaliza(Orcamento orcamento);
	double aplicaDescontoExtra(double valor);

}
