package patterns.design.template.method;

import patterns.design.strategy.Imposto;
import patterns.design.strategy.Orcamento;
import patterns.design.strategy.OrcamentoItens;

public class TesteTemplateMethod {

	public static void main(String[] args) {
//		Veja que ambas as classes de impostos só implementam as partes "que faltam" do algoritmo! 
//		A classe TemplateDeImpostoCondicional possui um método que funciona como um template, ou seja, 
//		um molde, para as classes filhas. Daí o nome do padrão de projeto: Template Method.
		
		Imposto impostoicpp = new ICPP();
		Imposto impostoikcv = new IKCV();

		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new OrcamentoItens("Teste 1", 15, 2.5));
		orcamento.adicionaItem(new OrcamentoItens("Teste 2", 20, 1.5));
		orcamento.adicionaItem(new OrcamentoItens("Teste 3", 55, 0.5));
		
		System.out.println("Menor Valor ICPP:" + impostoicpp.calcula(orcamento));
		System.out.println("Maior Valor IKCV:" + impostoikcv.calcula(orcamento));
		
		
		Orcamento orcamento2 = new Orcamento();
		orcamento2.adicionaItem(new OrcamentoItens("Teste 4", 400, 2.5));
		orcamento2.adicionaItem(new OrcamentoItens("Teste 5", 100, 1.5));
		orcamento2.adicionaItem(new OrcamentoItens("Teste 6", 50, 0.5));
		
		System.out.println("Maior Valor ICPP:" +impostoicpp.calcula(orcamento2));
		System.out.println("Maior Valor IKCV:" +impostoikcv.calcula(orcamento2));
		

	}

}
