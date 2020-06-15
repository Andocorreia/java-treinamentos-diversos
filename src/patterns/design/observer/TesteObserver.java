package patterns.design.observer;

import patterns.design.Builder.ItemNotaFiscal;
import patterns.design.Builder.NotaFiscal;
import patterns.design.Builder.NotaFiscalBuilder;

public class TesteObserver {

	public static void main(String[] args) {
		
//		Quando temos classes que serão notificadas sobre alguma coisa 
//		(no nosso caso, notificadas sobre a geração de uma nota fiscal) 
//		e um notificador que, assim que executa uma ação, notifica todos 
//		que estão na lista sobre o evento ocorrido, implementamos o padrão 
//		de projeto conhecido por Observer.
		
		NotaFiscal nf = new NotaFiscalBuilder().paraEmpresa("Teste")
				.comCnpj("123.123.123-05")
				.setObservacao("Observacao")
				.setImpostos(200)
				.adicionaItem(new ItemNotaFiscal("Item 1", 100, 1.21))
				.adicionaItem(new ItemNotaFiscal("Item 2", 200, 2.22))
				.adicionaItem(new ItemNotaFiscal("Item 3", 300, 3.23))
				.adicionaItem(new ItemNotaFiscal("Item 4", 400, 4.24))
				.acoesNF(new Impressora())
				.acoesNF(new EnviaSMS())
				.acoesNF(new EnviaEmail())
				.acoesNF(new NotaFiscalDao())
				.constroi();
	}

}
