package patterns.design.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class TesteFlyweight {

	public static void main(String[] args) {
		NotasMusicais nm = new NotasMusicais();
		
		List<Nota> musica = new ArrayList<Nota>();
		musica.add(nm.pega("do"));
		musica.add(nm.pega("re"));
		musica.add(nm.pega("mi"));
		musica.add(nm.pega("fa"));
		musica.add(nm.pega("fa"));
		musica.add(nm.pega("fa"));
		
		musica.add(nm.pega("do"));
		musica.add(nm.pega("re"));
		musica.add(nm.pega("do"));
		musica.add(nm.pega("re"));
		musica.add(nm.pega("re"));
		musica.add(nm.pega("re"));
		
		new Piano().toca(musica);
		
		
	}
}
