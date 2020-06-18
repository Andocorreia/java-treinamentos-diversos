package encapsulamento;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {

	Pessoa pessoa = new Pessoa();

	@Before
	public void init() {
		pessoa.setNome("André");
		pessoa.setTelefone("11-22223333");
		pessoa.setCpf("32132132112");
	}

	@Test
	public void dadoUmObjetoValidoTestamosOsGetters() {
		assertEquals("André", pessoa.getNome());
		assertEquals("11-22223333", pessoa.getTelefone());
		assertEquals("32132132112", pessoa.getCpf());
	}

	@Test
	public void dadoUmObjetoValidoOMetodoToStringDeveRetornarDados() {
		assertEquals("Pessoa [nome=André, cpf=32132132112]", pessoa.toString());
	}

	@Test
	public void dadoUmObjetoValidoOMetodoHashCodeDeveRetornarDados() {
		assertEquals(509088946, pessoa.hashCode());
	}

	@Test
	public void dadoDuasPessoasComNomesDivergentesMedotoEqualsRetornaFalse() {
		Pessoa novaPessoa1 = new Pessoa();
		novaPessoa1.setNome("André");
		novaPessoa1.setCpf("444.111.222-05");
		novaPessoa1.setTelefone("11-11112222");

		Pessoa novaPessoa2 = new Pessoa();
		novaPessoa2.setNome("André");
		novaPessoa2.setCpf("32132132112");
		novaPessoa2.setTelefone("1122223333");
		Pessoa novaPessoa3 = pessoa;
		String novaPessoa4 = "Teste";

		assertFalse(novaPessoa1.equals(pessoa));
		assertFalse(pessoa.equals(null));
		assertFalse(pessoa.equals(novaPessoa4));
		assertTrue(novaPessoa2.equals(pessoa));
		assertTrue(novaPessoa3.equals(pessoa));

	}

}
