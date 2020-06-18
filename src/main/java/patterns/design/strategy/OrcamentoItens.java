package patterns.design.strategy;

public class OrcamentoItens {
	private String nome;
	private Integer quantidade;
	private double valorUnitario;
	
	public OrcamentoItens(String nome, Integer quantidade, double valorUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	public double getValorTotal() {
		return this.valorUnitario * this.quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}	
	
}
