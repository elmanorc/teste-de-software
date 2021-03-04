package campeonato;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

	
	public static void main(String[] args) {
		
		//cria uma lista de times
		//cria uma lista de jogos (distribuídos corretamente)
		//define os resultados dos jogos
		//envia a lista de jogos para a tabela
		//faz perguntas à tabela
		
		Time t1 = new Time("Time A");
		Time t2 = new Time("Time B");
		Time t3 = new Time("Time C");
		Time t4 = new Time("Time D");
		Time t5 = new Time("Time E");

		List<Time> times = new ArrayList<Time>(); //o mais adequado é usar Set em vez de List
		times.add(t1);
		times.add(t2);
		times.add(t3);
		times.add(t4);
		times.add(t5);
		
		Jogo j12 = new Jogo(t1, t2);
		j12.setResultado(3, 2);
		Jogo j13 = new Jogo(t1, t3);
		j13.setResultado(1, 2);
		Jogo j14 = new Jogo(t1, t4);
		j14.setResultado(1, 1);
		Jogo j15 = new Jogo(t1, t5);
		j15.setResultado(0, 2);
		Jogo j23 = new Jogo(t2, t3);
		j23.setResultado(1, 0);
		Jogo j24 = new Jogo(t2, t4);
		j24.setResultado(2, 2);
		Jogo j25 = new Jogo(t2, t5);
		j25.setResultado(3, 1);
		Jogo j34 = new Jogo(t3, t4);
		j34.setResultado(1, 1);
		Jogo j35 = new Jogo(t3, t5);
		j35.setResultado(0, 0);
		Jogo j45 = new Jogo(t4, t5);
		j45.setResultado(3, 0);
		
		List<Jogo> jogos = new ArrayList<Jogo>();
		jogos.add(j12);
		jogos.add(j13);
		jogos.add(j14);
		jogos.add(j15);
		jogos.add(j23);
		jogos.add(j24);
		jogos.add(j25);
		jogos.add(j34);
		jogos.add(j35);
		jogos.add(j45);
		
		Tabela tabela = new Tabela();
		tabela.adicionaTimes(times);
		Time lider = tabela.getLider();
		Time lanterna = tabela.getLanterna();
		
		System.out.println(tabela);
		System.out.println("Lider = "+lider.getNome());
		System.out.println("Lanterna = "+lanterna.getNome());

	}
}
