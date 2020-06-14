package patterns.design.state;

import patterns.design.strategy.Orcamento;
import patterns.design.strategy.OrcamentoItens;

public class TesteState {

	public static void main(String[] args) {
		
//		Precisaríamos de várias condições (leia-se ifs), 
//		para alcançar o resultado esperado. O State nos ajuda nesse problema também. 
//		Basta representarmos as possíveis trocas em todas as classes que representam o estado.
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new OrcamentoItens("Item 1",100, 0.11));
		orcamento.adicionaItem(new OrcamentoItens("Item 2",200, 0.22));
		orcamento.adicionaItem(new OrcamentoItens("Item 3",300, 0.33));
		
		System.out.println("Orçamento Estado:" + orcamento.estadoAtual() + " - Valor: " + orcamento.getValor());
		orcamento.aprova();
		System.out.println("Orçamento Estado:" + orcamento.estadoAtual() + " - Valor: " + orcamento.getValor());
		orcamento.finaliza();
		System.out.println("Orçamento Estado:" + orcamento.estadoAtual() + " - Valor: " + orcamento.getValor());

		Orcamento orcamento2 = new Orcamento();
		orcamento2.adicionaItem(new OrcamentoItens("Item 1",100, 0.11));
		orcamento2.adicionaItem(new OrcamentoItens("Item 2",200, 0.22));
		orcamento2.adicionaItem(new OrcamentoItens("Item 3",300, 0.33));
		System.out.println("Orçamento Estado:" + orcamento2.estadoAtual() + " - Valor: " + orcamento2.getValor());
		orcamento2.reprova();
		System.out.println("Orçamento Estado:" + orcamento2.estadoAtual() + " - Valor: " + orcamento2.getValor());
		orcamento2.finaliza();
		System.out.println("Orçamento Estado:" + orcamento2.estadoAtual() + " - Valor: " + orcamento2.getValor());
	}

}
