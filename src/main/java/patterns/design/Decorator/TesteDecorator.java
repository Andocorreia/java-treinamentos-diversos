package patterns.design.Decorator;

import patterns.design.strategy.ICMS;
import patterns.design.strategy.ISS;
import patterns.design.strategy.Imposto;
import patterns.design.strategy.Orcamento;
import patterns.design.strategy.OrcamentoItens;
import patterns.design.template.method.ICPP;

public class TesteDecorator {

	public static void main(String[] args) {
		
//		Quando compomos comportamento, através de classes que recebem objetos do mesmo tipo que 
//		elas mesmas (nesse caso, ISS que é um Imposto, recebe em seu construtor outro Imposto) 
//		para fazerem parte de seu comportamento, de uma maneira que seu uso é definido a partir 
//		do que se passou para a instanciação dos objetos, é o que caracteriza o Design Pattern chamado Decorator.
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new OrcamentoItens("Teste 1", 100, 1.20));
		orcamento.adicionaItem(new OrcamentoItens("Teste 2", 300, 2.20));
		orcamento.adicionaItem(new OrcamentoItens("Teste 3", 400, 3.20));
		
		Imposto impostos = new ISS(new ICPP( new ICMS()));
		System.out.println("Total do Orcamento:" + orcamento.getValor());
		System.out.println("Total de Impostos:" + impostos.calcula(orcamento));

	}

}
