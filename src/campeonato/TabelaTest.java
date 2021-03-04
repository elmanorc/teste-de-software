package campeonato;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TabelaTest {

	//getClassificadosSeriaA
	@Test
	public void getClassificadosSeriaA() {
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
		
		List<Time> classificados = tabela.getClassificados();
		assertEquals(4, classificados.size());
		assertEquals("Time B", classificados.get(0).getNome());
		assertEquals("Time D", classificados.get(1).getNome());
		assertEquals("Time C", classificados.get(2).getNome());
		assertEquals("Time A", classificados.get(3).getNome());

	}
}
