package patterns.design.interpreter;

public class TesteInterpreter {

	public static void main(String[] args) {
//		Quando temos expressões que devem ser avaliadas, 
//		e a transformamos em uma estrutura de dados, 
//		e depois fazemos com que a própria árvore se avalie, 
//		damos o nome de Interpreter
		
		Expressao direita = new Subtracao(new Numero(10), new Numero(5));
		Expressao esquerda = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);
		
		int resultado = soma.avalia();
		
		System.out.println("Resultado:" + resultado);

	}

}
