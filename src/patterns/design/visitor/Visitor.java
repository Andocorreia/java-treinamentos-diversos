package patterns.design.visitor;

import patterns.design.interpreter.Divisao;
import patterns.design.interpreter.Multiplicacao;
import patterns.design.interpreter.Numero;
import patterns.design.interpreter.Soma;
import patterns.design.interpreter.Subtracao;

public class Visitor {

	public void visitaSoma(Soma soma) {
		System.out.print("(");
		soma.getExpressaoEsquerda().visita(this);
		System.out.print("+");
		soma.getExpressaoDireita().visita(this);
		System.out.print(")");
	}

	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print("(");
		subtracao.getExpressaoEsquerda().visita(this);
		System.out.print("-");
		subtracao.getExpressaoDireita().visita(this);
		System.out.print(")");
	}

	public void visitaDivisao(Divisao divisao) {
		System.out.print("(");
		divisao.getExpressaoEsquerda().visita(this);
		System.out.print("/");
		divisao.getExpressaoDireita().visita(this);
		System.out.print(")");
	}

	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
		System.out.print("(");
		multiplicacao.getExpressaoEsquerda().visita(this);
		System.out.print("*");
		multiplicacao.getExpressaoDireita().visita(this);
		System.out.print(")");
	}

	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
		
	}

}
