package encapsulamento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import collection.lists.Aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class EnfermeiroTest {
	
	private Enfermeiro enfermeiro;
	
	@BeforeEach
	public void init() {
		enfermeiro = new Enfermeiro("André", "333.111.222-05", "11-11112222");
	}
	
	@Test
	public void dadoUmEnfermeiroValidoRetornaOsDadosDaPessoa() {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("André");
		pessoa.setCpf("333.111.222-05");
		pessoa.setTelefone("11-11112222");
		
		assertEquals(pessoa.getNome(), enfermeiro.getPessoa().getNome());
		assertEquals(pessoa.getCpf(), enfermeiro.getPessoa().getCpf());
		assertEquals(pessoa.getTelefone(), enfermeiro.getPessoa().getTelefone());
		assertEquals(pessoa.getNome(), enfermeiro.retornaNome());
		assertEquals(pessoa, enfermeiro.retornaInformacoes());
	}
	
	@Test
	public void dadoUmEnfermeiroValidoQuandoOMetodoSetPessoaForChamadoAlteraTodasAsInformacoes() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Matheus");
		pessoa.setCpf("111.222.333-44");
		pessoa.setTelefone("22-33334444");
		
		enfermeiro.setPessoa(pessoa);
		
		assertEquals(pessoa.getNome(), enfermeiro.getPessoa().getNome());
		assertEquals(pessoa.getCpf(), enfermeiro.getPessoa().getCpf());
		assertEquals(pessoa.getTelefone(), enfermeiro.getPessoa().getTelefone());
		assertEquals(pessoa.getNome(), enfermeiro.retornaNome());
		assertEquals(pessoa, enfermeiro.retornaInformacoes());
	}
	
	@Test
	public void dadoUmEnfermeiroValidoValidamosOToString() {
		assertEquals("Enfermeiro [pessoa=André]", enfermeiro.toString());
	}
	
	@Test
	public void dadoUmEnfermeiroValidoValidamosOHashCode() {
		assertEquals(-1416627850, enfermeiro.hashCode());
	}
	
	@Test
	public void dadoDoisEnfermeirosComNomesDivergentesMedotoEqualsRetornaFalse() {
		Enfermeiro novoEnfermeiro1 = new Enfermeiro("André", "444.111.222-05", "11-11112222");
		Enfermeiro novoEnfermeiro2 = new Enfermeiro("André", "333.111.222-05", "11-11112222");
		Enfermeiro novoEnfermeiro3 = enfermeiro;
		String novoEnfermeiro4 = "Teste";
		
		assertFalse(novoEnfermeiro1.equals(enfermeiro));
		assertFalse(enfermeiro.equals(null));
		assertFalse(enfermeiro.equals(novoEnfermeiro4));
		assertTrue(novoEnfermeiro2.equals(enfermeiro));
		assertTrue(novoEnfermeiro3.equals(enfermeiro));
			
	}
}
