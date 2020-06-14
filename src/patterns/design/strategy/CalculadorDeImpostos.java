package patterns.design.strategy;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valorImposto = imposto.calcula(orcamento);
		System.out.println("Imposto: " + imposto.toString() + "Valor: " + valorImposto);
	}

}
