package patterns.design.Flyweight;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {
	
	public void toca(List<Nota> musica) {
		
//		Sempre que temos uma quantidade grande de objetos similares a serem instanciados, 
//		uma boa solução é fazer cache dessas instâncias e reutilizá-la. Para isso, 
//		a implementação é geralmente fazer uso de uma fábrica, que controla as instâncias. 
//		Esse padrão é conhecido por flyweight.
		
		
		Player player = new Player();
		StringBuilder musicaEmNotas = new StringBuilder();
		musica.forEach(nota -> musicaEmNotas.append(nota.simbolo() + " "));
		player.play(musicaEmNotas.toString());
		
	}
}
