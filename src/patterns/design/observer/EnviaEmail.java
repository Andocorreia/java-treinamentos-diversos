package patterns.design.observer;

import patterns.design.Builder.NotaFiscal;

public class EnviaEmail implements AcoesAposGerarNotaFiscal {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Envia e-mail com a nota fiscal");
	}

}
