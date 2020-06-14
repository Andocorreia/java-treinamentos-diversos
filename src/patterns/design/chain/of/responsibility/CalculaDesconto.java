package patterns.design.chain.of.responsibility;

import patterns.design.strategy.Orcamento;

public class CalculaDesconto {
	
	public void calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoPrincipal();
		Desconto d2 = new DescontoSecundario();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		System.out.println("Desconto calculado:" + d1.calculaDesconto(orcamento));
		
		
	}

}
