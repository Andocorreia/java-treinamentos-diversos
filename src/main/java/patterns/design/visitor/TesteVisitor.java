package patterns.design.visitor;

import patterns.design.interpreter.Expressao;
import patterns.design.interpreter.Numero;
import patterns.design.interpreter.Soma;
import patterns.design.interpreter.Subtracao;

public class TesteVisitor {

	public static void main(String[] args) {
//		Quando temos uma árvore, e precisamos navegar nessa árvore de maneira organizada, podemos usar um Visitor
		
		Expressao direita = new Subtracao(new Numero(10), new Numero(5));
		Expressao esquerda = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);

		int resultado = soma.avalia();

		System.out.print("Resultado:" + resultado + " - Expressao:");
		
		Visitor visitor = new Visitor();
		soma.visita(visitor);
	}
}
