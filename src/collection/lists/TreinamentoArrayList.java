package collection.lists;

import java.util.ArrayList;
import java.util.Collection;

public class TreinamentoArrayList {
	public static void main(String[] args) {
		Collection arrayList = new ArrayList();

		arrayList.add("Matheus");
		arrayList.add("Vanessa");
		arrayList.add("Vitoria");
		arrayList.add("Andre");

		System.out.println("Tamanho do array: " + arrayList.size());
		
		//Classifica o array
		arrayList.stream().sorted().forEach(nome -> System.out.println("Nomes ordenados: " + nome));
		
		//Filtra um array
		arrayList.stream().filter(nome -> nome == "Vitoria").forEach(nome -> System.out.println("Nome Filtrado :" + nome));
		
		//Map um item da Lista
		arrayList.stream().map(nome -> ((String) nome).substring(0,3)).forEach(System.out::println);
		
		
		//Removendo um item da Lista
		arrayList.stream().filter(nome -> nome == "Andre").forEach(item -> System.out.println("Removendo: " + item));
		
	}

}
