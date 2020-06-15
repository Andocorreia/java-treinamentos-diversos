package patterns.design.factory;

import java.sql.Connection;

public class TesteFactory {

	public static void main(String[] args) {
//		Quando precisamos isolar o processo de criação de um objeto, 
//		para facilitar a troca dele no futuro, levamos o processo de 
//		instanciação dessa classe para uma Factory.
		
		Connection cf = new ConnectionFactory().getConnection() ;
		
		System.out.println("Conexao Criada: " + cf.toString());
		

	}

}
