package patterns.design.interpreter;

import patterns.design.observer.Impressora;
import patterns.design.visitor.Visitor;

public class Divisao implements Expressao{

	private Expressao expressaoDireita;
	public Expressao getExpressaoDireita() {
		return expressaoDireita;
	}

	public Expressao getExpressaoEsquerda() {
		return expressaoEsquerda;
	}

	private Expressao expressaoEsquerda;

	public Divisao(Expressao expressaoDireita, Expressao expressaoEsquerda) {
		this.expressaoDireita = expressaoDireita;
		this.expressaoEsquerda = expressaoEsquerda;
	}
	
	@Override
	public int avalia() {
		Integer direita = this.expressaoDireita.avalia(); 
		Integer esquerda = this.expressaoEsquerda.avalia();
		return direita / esquerda;
	}

	@Override
	public void visita(Visitor visitor) {
		visitor.visitaDivisao(this);
		
	}

}
