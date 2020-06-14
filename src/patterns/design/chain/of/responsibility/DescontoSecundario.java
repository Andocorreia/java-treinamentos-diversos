package patterns.design.chain.of.responsibility;

import patterns.design.strategy.Orcamento;

public class DescontoSecundario implements Desconto {
	Desconto proximoDesconto;
	
	@Override
	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getValor() > 200) {
			return orcamento.getValor() * 0.15;
		}
		return this.proximoDesconto.calculaDesconto(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		proximoDesconto = proximo;
	}

}
