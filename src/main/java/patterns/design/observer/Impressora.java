package patterns.design.observer;

import patterns.design.Builder.NotaFiscal;

public class Impressora implements AcoesAposGerarNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Impressora");
	}

}
