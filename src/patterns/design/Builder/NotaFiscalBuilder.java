package patterns.design.Builder;

import java.util.ArrayList;
import java.util.List;

import patterns.design.observer.AcoesAposGerarNotaFiscal;

public class NotaFiscalBuilder {
	private String razaoSocial;
    private String cnpj;
    private double impostos;
    private String observacoes;
    private List<ItemNotaFiscal> itens = new ArrayList<ItemNotaFiscal>();
    private List<AcoesAposGerarNotaFiscal> acoes = new ArrayList<AcoesAposGerarNotaFiscal>();
	
    public NotaFiscalBuilder paraEmpresa(String nomeEmpresa) {
		razaoSocial = nomeEmpresa;
		return this;
    }
    
    public NotaFiscalBuilder acoesNF(AcoesAposGerarNotaFiscal acoes) {
    	this.acoes.add(acoes);
    	return this;
    }
    
    public NotaFiscalBuilder adicionaItem(ItemNotaFiscal item) {
    	this.itens.add(item);
    	return this;
    }
    
    public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
    }
    
    public NotaFiscalBuilder setImpostos(double valorImposto) {
    	this.impostos = valorImposto;
    	return this;
    }
    
    public NotaFiscalBuilder setObservacao(String observacao) {
    	this.observacoes = observacao;
    	return this;
    }
    
    
    public NotaFiscal constroi() {
    	
    	NotaFiscal nf = new NotaFiscal(this.razaoSocial, this.cnpj, this.observacoes, this.itens, this.impostos);
    	this.acoes.forEach(acao -> acao.executa(nf));
    	return nf;
    }
    
}
