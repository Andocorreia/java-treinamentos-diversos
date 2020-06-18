package encapsulamento;

public class Medico implements Especialista {

	private Pessoa pessoa = new Pessoa();

	public Medico(String nome, String cpf, String telefone) {
		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		pessoa.setTelefone(telefone);

	}

	@Override
	public Pessoa retornaInformacoes() {
		return this.pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	@Override
	public String toString() {
		return "Medico [pessoa=" + pessoa + "]";
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
		Medico other = (Medico) obj;
		if (!pessoa.getCpf().equals(other.pessoa.getCpf()))
			return false;
		return true;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String retornaNome() {
		System.out.println("Classe Medico");
		return this.pessoa.getNome();
	}

}
