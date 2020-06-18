package patterns.design.chain.of.responsibility;

import patterns.design.strategy.Orcamento;

public class DescontoPrincipal implements Desconto {
	private Desconto proximoDesconto;
	
	@Override
	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.30;
		}
		
		return this.proximoDesconto.calculaDesconto(orcamento);
	}

	@Override
	public void setProximo(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;	

	}

}
