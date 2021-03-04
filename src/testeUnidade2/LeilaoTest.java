package testeUnidade2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeilaoTest {
	
	@Test
	public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
		Leilao leilao = new Leilao("Macbook Pro 15");
		Usuario steveJobs = new Usuario("Steve Jobs");
		leilao.propoe(new Lance(steveJobs, 2000));
		leilao.propoe(new Lance(steveJobs, 3000));
		assertEquals(1, leilao.getLances().size());
		assertEquals("Usuário não pode propor dois lances seguidos", 
				2000, leilao.getLances().get(0).getValor(), 0.00001);
	}
}
