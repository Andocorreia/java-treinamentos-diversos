package patterns.design.chain.of.responsibility;

import patterns.design.strategy.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double calculaDesconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		//Não tem proximo desconto

	}

}
