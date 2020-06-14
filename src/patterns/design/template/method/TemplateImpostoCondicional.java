package patterns.design.template.method;

import patterns.design.strategy.Imposto;
import patterns.design.strategy.Orcamento;

public abstract class TemplateImpostoCondicional extends Imposto {

	public TemplateImpostoCondicional() {}
	
	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public double calcula(Orcamento orcamento) {
		if(this.usaMaximaTaxacao(orcamento)) {
			return this.taxacaoMaxima(orcamento);
		}else {
			return this.taxacaoMinima(orcamento);
		}
	}

	public abstract double taxacaoMaxima(Orcamento orcamento);
	public abstract double taxacaoMinima(Orcamento orcamento);
	public abstract boolean usaMaximaTaxacao(Orcamento orcamento);
}
