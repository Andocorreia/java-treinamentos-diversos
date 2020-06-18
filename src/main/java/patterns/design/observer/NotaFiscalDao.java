package patterns.design.observer;

import patterns.design.Builder.NotaFiscal;

public class NotaFiscalDao implements AcoesAposGerarNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota Fiscal DAO");
	}

}
