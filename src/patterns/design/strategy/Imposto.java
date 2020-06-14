package patterns.design.strategy;

public abstract class Imposto {
	
	private Imposto outroImposto;

	public Imposto (Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public Imposto() {}
	
	public abstract double calcula(Orcamento valor);
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		return this.outroImposto.calcula(orcamento);
		
	}
	
}
