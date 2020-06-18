package collection.lists;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AlunoTest{
	
	private Aluno aluno;
	
	@BeforeEach
	public void init() {
		aluno = new Aluno("André", 35);
	}
	
	@Test
	public void dadoUmAlunoValidoRetornaAIdade() {
		aluno.setIdade(6);
		assertEquals(6, aluno.getIdade());		
	}
	
	@Test
	public void dadoUmAlunoValidoRetornaONome() {
		aluno.setNome("Matheus");
		assertEquals("Matheus", aluno.getNome());		
	}
	
	@Test
	public void dadoDoisAlunosEquivalentesMedotoEqualsRetornaTrue() {
		Aluno novoAluno = new Aluno("André", 35);
		assertTrue(novoAluno.equals(aluno));		
	}
	
	@Test
	public void dadoDoisAlunosComIdadesDivergentesMedotoEqualsRetornaFalse() {
		Aluno novoAluno = new Aluno("André", 33);
		assertFalse(novoAluno.equals(aluno));		
	}
	
	@Test
	public void dadoDoisAlunosComNomesDivergentesMedotoEqualsRetornaFalse() {
		Aluno novoAluno1 = new Aluno("Matheus", 35);
		Aluno novoAluno2 = new Aluno("André", 33);
		Aluno novoAluno3 = new Aluno("André", 35);
		Aluno novoAluno4 = aluno;
		String novoAluno5 = "André";
		
		assertFalse(novoAluno1.equals(aluno));
		assertFalse(novoAluno2.equals(aluno));
		assertTrue(novoAluno3.equals(aluno));
		assertTrue(novoAluno4.equals(aluno));
		assertFalse(aluno.equals(novoAluno5));
	}
	
	@Test
	public void dadoUmAlunoValidoOMetodoToStringDeveSerValidado() {
		assertEquals("Aluno [nome=André, idade=35]", aluno.toString());
		
	}
	
	@Test
	public void dadoUmAlunoValidoOMetodoHashCodeDeveSerValidado() {
		Aluno novoAluno = new Aluno(null, 35);
		assertEquals(2046, novoAluno.hashCode());
		assertEquals(63407788, aluno.hashCode());
		
	}

}
