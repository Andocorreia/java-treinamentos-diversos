package patterns.design.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	private List<Estado> estadosSalvos = new ArrayList<Estado>();
	
	public void adiciona(Estado estado) {
		this.estadosSalvos.add(estado);
	}
	
	public Estado pega(Integer index) {
		return estadosSalvos.get(index);
	}
	
	public Integer tamanho() {
		return estadosSalvos.size();
	}
}
