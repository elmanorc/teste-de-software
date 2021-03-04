package campeonato;

import java.util.InputMismatchException;

import org.junit.Test;

public class JogoTest {

	@Test (expected=InputMismatchException.class)
	public void umTimeNaoPodeSeEnfrentar1() {
		Time sport = new Time("Sport");
		Jogo jogo = new Jogo(sport, sport);
	}
	
	@Test (expected=InputMismatchException.class)
	public void umTimeNaoPodeSeEnfrentar2() {
		Time sport1 = new Time("Sport");
		Time sport2 = new Time("Sport");
		Jogo jogo = new Jogo(sport1, sport2);
	}
	
	@Test
	public void timeAVence() {
		
	}
	
	@Test
	public void timeBVence() {
		
	}
	
	@Test
	public void empateZeroAZero() {
		
	}
	
	@Test
	public void empateComGols() {
		
	}
}
