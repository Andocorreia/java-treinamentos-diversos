package patterns.design.interpreter;

import patterns.design.visitor.Visitor;

public class Numero implements Expressao {

	private Integer numero;
	
	public Numero(Integer numero) {
		this.numero = numero;
	}


	@Override
	public int avalia() {
		return numero;
	}
	
	@Override
	public void visita(Visitor visitor) {
		visitor.visitaNumero(this);
		
	}


	public Integer getNumero() {
		return numero;
	}

}
