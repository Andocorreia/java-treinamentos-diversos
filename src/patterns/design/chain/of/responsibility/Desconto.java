package patterns.design.chain.of.responsibility;

import patterns.design.strategy.Orcamento;

public interface Desconto {
	double calculaDesconto(Orcamento orcamento);
	void setProximo(Desconto proximo); 
}
