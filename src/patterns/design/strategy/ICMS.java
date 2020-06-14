package patterns.design.strategy;

public class ICMS extends Imposto{

	public ICMS() {}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.3;
	}

	@Override
	public String toString() {
		return "ICMS";
	}
	
}
