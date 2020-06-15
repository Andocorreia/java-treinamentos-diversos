package patterns.design.memento;

import java.time.LocalDate;

public class TesteMemento {
	public static void main(String[] args) {

		//O Memento é um padrão de projeto que nos ajuda a salvar e restaurar estados de objetos.
		
		Historico h1 = new Historico();
		
		Contrato contrato = new Contrato(LocalDate.now(), "André", TipoContrato.NOVO);
		h1.adiciona(contrato.salvaEstado());
		System.out.println("Estado do contrato: " + contrato.getTipoContrato());
		
		contrato.avanca();
		h1.adiciona(contrato.salvaEstado());
		System.out.println("Estado do contrato: " + contrato.getTipoContrato());
		
		contrato.avanca();
		h1.adiciona(contrato.salvaEstado());
		System.out.println("Estado do contrato: " + contrato.getTipoContrato());
		
		Estado estadoAnterior = h1.pega(h1.tamanho() - 2);
		System.out.println("Estado anterior do contrato: " + estadoAnterior.getEstado().getTipoContrato());
	}
}
