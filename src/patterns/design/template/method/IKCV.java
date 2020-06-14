package patterns.design.template.method;

import patterns.design.strategy.Orcamento;

public class IKCV extends TemplateImpostoCondicional {

	@Override
	public double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.5;
	}

	@Override
	public double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.2;
	}

	@Override
	public boolean usaMaximaTaxacao(Orcamento orcamento) {
		if(orcamento.getValor() > 500) {
			return true;
		}
		return false;
	}



}
