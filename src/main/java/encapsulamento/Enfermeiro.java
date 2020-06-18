package encapsulamento;

public class Enfermeiro implements Especialista {

	private Pessoa pessoa = new Pessoa();

	public Enfermeiro(String nome, String cpf, String telefone) {
		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		pessoa.setTelefone(telefone);
	}
	
	@Override
	public Pessoa retornaInformacoes() {
		return pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pessoa.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enfermeiro other = (Enfermeiro) obj;
		if (!pessoa.getCpf().equals(other.pessoa.getCpf()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Enfermeiro [pessoa=" + pessoa.getNome() + "]";
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@Override
	public String retornaNome() {
		System.out.println("Classe Enfermeiro");
		return this.pessoa.getNome();
	}

}
