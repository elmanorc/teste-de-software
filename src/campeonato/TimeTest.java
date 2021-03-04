package campeonato;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TimeTest {

	@Test
	public void verificaSaldoDeGols() {
		Time brasil = new Time("Brasil");
		brasil.setGolsFeitos(1);
		brasil.setGolsSofridos(7);
		int saldo = brasil.getSaldoGols();
		assertEquals(-6, saldo);
	}
	
	@Test
	public void verificaSaldoZero() {
		Time brasil = new Time("Brasil");
		brasil.setGolsFeitos(5);
		brasil.setGolsSofridos(5);
		int saldo = brasil.getSaldoGols();
		assertEquals(0, saldo);
	}
	
	@Test
	public void testaPontuacao1() {
		Time brasil = new Time("Brasil");
		Time alemanha = new Time("Alemanha");
		brasil.setPontuacao(15);
		brasil.setVitorias(3);
		alemanha.setPontuacao(15);
		alemanha.setVitorias(4);
		assertTrue(brasil.compareTo(alemanha) < 0);
		
	}
}
