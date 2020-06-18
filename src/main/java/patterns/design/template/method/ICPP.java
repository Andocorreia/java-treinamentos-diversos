package patterns.design.template.method;

import patterns.design.strategy.Imposto;
import patterns.design.strategy.Orcamento;

public class ICPP extends TemplateImpostoCondicional{

	public ICPP() {}
	
	public ICPP (Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double taxacaoMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.2;
	}

	@Override
	public double taxacaoMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean usaMaximaTaxacao(Orcamento orcamento) {
		if(orcamento.getValor() > 200) {
			return true;
		}
		return false;
	}

}
