package patterns.design.interpreter;

import patterns.design.visitor.Visitor;

public class Subtracao implements Expressao {

	private Expressao expressaoDireita;
	private Expressao expressaoEsquerda;

	public Subtracao(Expressao expressaoDireita, Expressao expressaoEsquerda) {
		this.expressaoDireita = expressaoDireita;
		this.expressaoEsquerda = expressaoEsquerda;
	}
	
	@Override
	public int avalia() {
		Integer direita = this.expressaoDireita.avalia(); 
		Integer esquerda = this.expressaoEsquerda.avalia();
		return direita - esquerda;
	}
	
	@Override
	public void visita(Visitor visitor) {
		visitor.visitaSubtracao(this);
		
	}

	public Expressao getExpressaoDireita() {
		return expressaoDireita;
	}

	public Expressao getExpressaoEsquerda() {
		return expressaoEsquerda;
	}

}
