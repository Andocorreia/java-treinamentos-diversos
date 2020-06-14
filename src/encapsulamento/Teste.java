package encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Medico pessoa1 = new Medico("VANESSA CORREIA","123456789", "123456781");
		Medico pessoa2 = new Medico("MATHEUS CORREIA", "554213685", "147852369");
		Enfermeiro pessoa3 = new Enfermeiro("VITORIA CORREIA", "369852147", "126654721");
		Enfermeiro pessoa4 = new Enfermeiro("ANDRE O CORREIA", "233456678", "987654321");
		
		imprime(pessoa1);
		imprime(pessoa2);
		imprime(pessoa3);
		imprime(pessoa4);
		
		
	}
	
	private static void imprime(Especialista especialista) {
		System.out.println(especialista.retornaNome());
	}

}
