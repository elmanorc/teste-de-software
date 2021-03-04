package campeonato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tabela {

	private List<Time> listaTimes; //o correto é usar Set em vez de List
	
	public Tabela() {
		listaTimes = new ArrayList<Time>();
	}
	
	public void adicionaTimes(List<Time> times) {
		listaTimes.addAll(times);
		Collections.sort(listaTimes, Collections.reverseOrder()); //do maior para o menor
	}
	
	public Time getLider() {
		return listaTimes.get(0);
	}
	
	public Time getLanterna() {
		return listaTimes.get(listaTimes.size()-1);
	}
	
	public String toString() {
		String resultado = "Time \t Pontuação \t Vitórias \t Derrotas \t Empates \t Gols feitos \t Gols Sofridos \t Saldo de gols \n";
		for (Time time : listaTimes) {
			resultado += time.toString()+"\n";
		}
		return resultado;
	}

	public List<Time> getClassificados() {
		List<Time> classificados = new ArrayList<Time>();
		classificados.add(listaTimes.get(0));
		classificados.add(listaTimes.get(1));
		classificados.add(listaTimes.get(2));
		classificados.add(listaTimes.get(3));
		return classificados;
	}
	
}
