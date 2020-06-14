package patterns.design.strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		
//		Quando utilizamos uma hierarquia, 
//		como fizemos com a classe Imposto e as implementações ICMS e ISS, 
//		e recebemos o tipo mais genérico como parâmetro, 
//		para ganharmos o polimorfismo na regra que será executada, 
//		simplificando o código e sua evolução, estamos usando o Design Pattern chamado Strategy.
//		
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new OrcamentoItens("Item 1", 500, 1));
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);

	}

}
