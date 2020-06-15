package patterns.design.Builder;

public class ItemNotaFiscal {

	private String nome;
	private Integer quantidade;
	private double valorUnitario;
	
	public String getNome() {
		return nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public ItemNotaFiscal(String nome, Integer quantidade, double valorUnitario) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	public double valorTotal () {
		return quantidade * valorUnitario;
	}	
	
}
