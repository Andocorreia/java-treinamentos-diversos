package patterns.design.observer;

import patterns.design.Builder.NotaFiscal;

public class EnviaSMS implements AcoesAposGerarNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Envia SMS");
	}

}
