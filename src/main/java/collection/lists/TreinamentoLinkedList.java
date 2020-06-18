package collection.lists;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TreinamentoLinkedList {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Vanessa", 38);
		Aluno aluno2 = new Aluno("Vitoria", 1);
		Aluno aluno3 = new Aluno("Matheus", 6);
		Aluno aluno4 = new Aluno("André", 35);
		
		List<Aluno> alunos = new LinkedList();
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		
		System.out.println("Total de Alunos: " + alunos.size());
		
		alunos.sort(Comparator.comparing(Aluno::getNome));
		
		alunos.forEach(aluno -> System.out.println("Alunos Ordenados:" + aluno.getNome()));
		
		System.out.println(alunos.get(2).getNome());
		

	}

}
