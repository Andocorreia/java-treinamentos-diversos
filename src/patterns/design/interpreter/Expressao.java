package patterns.design.interpreter;

import patterns.design.visitor.Visitor;

public interface Expressao {
	
	public int avalia();
	public void visita(Visitor visitor);
}