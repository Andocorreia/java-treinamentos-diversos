package encapsulamento;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MedicoTest {

	private Medico medico;

	@Before
	public void init() {
		medico = new Medico("André", "12312312312", "1122223333");
	}

	@Test
	public void dadoUmObjetoPessoaValidoOMetodoRetornaNomeDeveRetornarONomeDaPessoa() {
		assertEquals("André", medico.retornaNome());
	}
	
	@Test
	public void dadoUmObjetoPessoaValidoOMetodoSetPessoaDeveAlterarAsInformacoes() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Matheus");
		pessoa.setCpf("32132132");
		pessoa.setTelefone("2233334444");
		medico.setPessoa(pessoa);
		assertEquals("Matheus", medico.getPessoa().getNome());
		assertEquals("32132132", medico.getPessoa().getCpf());
		assertEquals("2233334444", medico.getPessoa().getTelefone());
	}
	
	@Test
	public void dadoUmObjetoPessoaValidoOMetodoRetornaInformacoesDeveRetornarAsInformacoes() {
		assertEquals("André", medico.retornaInformacoes().getNome());
		assertEquals("12312312312", medico.retornaInformacoes().getCpf());
		assertEquals("1122223333", medico.retornaInformacoes().getTelefone());
	}
	
	@Test
	public void dadoUmObjetoValidoOMetodoToStringDeveRetornarInformacoes() {
		assertEquals("Medico [pessoa=Pessoa [nome=André, cpf=12312312312]]", medico.toString());
	}
	
	@Test
	public void dadoUmObjetoValidoOMetodoHashCodeDeveRetornarInformacoes() {
		assertEquals(1352842577, medico.hashCode());
	}
	
	@Test
	public void dadoDoisEnfermeirosComNomesDivergentesMedotoEqualsRetornaFalse() {
		Medico novoMedico1 = new Medico("André", "444.111.222-05", "11-11112222");
		Medico novoMedico2 = new Medico("André", "12312312312", "1122223333");
		Medico novoMedico3 = medico;
		String novoMedico4 = "Teste";
		
		assertFalse(novoMedico1.equals(medico));
		assertFalse(medico.equals(null));
		assertFalse(medico.equals(novoMedico4));
		assertTrue(novoMedico2.equals(medico));
		assertTrue(novoMedico3.equals(medico));
			
	}
}
