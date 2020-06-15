package patterns.design.Builder;

public class TesteBuilder {
	
	public static void main(String[] args) {
		
//		Objetos complexos existem e vão continuar existindo. 
//		Caso ele seja complexo, o desenvolvedor deve pensar em prover um Builder para o objeto, 
//		e facilitar a vida das classes que precisam instanciar essas classes complexas.
		
		NotaFiscal nf = new NotaFiscalBuilder()
				.paraEmpresa("Teste")
				.comCnpj("123.123.123-05")
				.setObservacao("Observacao")
				.setImpostos(200)
				.adicionaItem(new ItemNotaFiscal("Item 1", 100, 1.21))
				.adicionaItem(new ItemNotaFiscal("Item 2", 200, 2.22))
				.adicionaItem(new ItemNotaFiscal("Item 3", 300, 3.23))
				.adicionaItem(new ItemNotaFiscal("Item 4", 400, 4.24))
				.constroi();
		System.out.println("Nota fiscal criada com o valor: " + nf.getValorTotal());
	}
}
