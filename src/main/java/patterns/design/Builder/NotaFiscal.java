package patterns.design.Builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	private LocalDate dataEmissao;
	private String obsercacoes;
	private Double impostos;
	private List<ItemNotaFiscal> itens = new ArrayList<ItemNotaFiscal>();
	
	public NotaFiscal(String razaoSocial, String cnpj, String obsercacoes,
			List<ItemNotaFiscal> itens, double impostos) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = LocalDate.now();
		obsercacoes = obsercacoes;
		this.itens = itens;
		this.impostos = impostos;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public String getObsercacoes() {
		return obsercacoes;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}
	
	public double getValorTotal() {
		return this.itens.stream().mapToDouble(ItemNotaFiscal::valorTotal).sum() - this.impostos;
	}
	
	public double getImpostos() {
		return this.impostos;
		
	}

}
