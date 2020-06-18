package patterns.design.chain.of.responsibility;

import patterns.design.strategy.Orcamento;
import patterns.design.strategy.OrcamentoItens;

public class TesteChainOfResponsability {
	
	public static void main(String[] args) {
		
//		Esses descontos formam como se fosse uma "corrente", 
//		ou seja, um ligado ao outro. Daí o nome do padrão de projeto: Chain of Responsibility. 
		
		
		Orcamento o1 = new Orcamento();
		o1.adicionaItem(new OrcamentoItens("Item 1", 100, 1));
		o1.adicionaItem(new OrcamentoItens("Item 2", 200, 0.5));
		
		
		Orcamento o2 = new Orcamento();
		o2.adicionaItem(new OrcamentoItens("Item 1", 201, 1));
		
		Orcamento o3 = new Orcamento();
		o3.adicionaItem(new OrcamentoItens("Item 1", 501, 1));
		
		CalculaDesconto calculadora = new CalculaDesconto();
		calculadora.calcula(o1);
		calculadora.calcula(o2);
		calculadora.calcula(o3);

		
	}

}
