package collection.lists;

import java.util.HashSet;
import java.util.List;

public class TreinemantoHashSet {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Vanessa", 38);
		Aluno aluno2 = new Aluno("Matheus", 6);
		Aluno aluno3 = new Aluno("Vitoria", 1);
		Aluno aluno4 = new Aluno("André", 35);

		HashSet alunos = new HashSet();
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		
		alunos.forEach(System.out::println);
		
		alunos.stream().filter(aluno -> ((Aluno) aluno).getNome() == "André").forEach(nomeAluno -> System.out.println("nomeAluno"));
		
		alunos.stream().map(aluno -> ((Aluno) aluno).getNome().substring(0, 3)).forEach(System.out::println);
		
		Aluno aluno5 = new Aluno("André", 35);
		alunos.add(aluno5);
		alunos.forEach(System.out::println);

	}

}
