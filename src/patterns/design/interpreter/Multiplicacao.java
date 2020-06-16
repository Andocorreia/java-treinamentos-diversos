package patterns.design.interpreter;

import patterns.design.visitor.Visitor;

public class Multiplicacao implements Expressao {

	private Expressao expressaoDireita;
	private Expressao expressaoEsquerda;

	public Multiplicacao(Expressao expressaoDireita, Expressao expressaoEsquerda) {
		this.expressaoDireita = expressaoDireita;
		this.expressaoEsquerda = expressaoEsquerda;
	}
	
	@Override
	public int avalia() {
		Integer direita = this.expressaoDireita.avalia(); 
		Integer esquerda = this.expressaoEsquerda.avalia();
		return direita * esquerda;
	}
	
	@Override
	public void visita(Visitor visitor) {
		visitor.visitaMultiplicacao(this);
		
	}

	public Expressao getExpressaoDireita() {
		return expressaoDireita;
	}

	public Expressao getExpressaoEsquerda() {
		return expressaoEsquerda;
	}

}
