package testeUnidade;

import org.junit.Assert;
import org.junit.Test;

public class TestaMaiorEMenor {

	@Test
	public void ordemDecrescente() {
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adiciona(new Produto("Geladeira", 450.0));
		cc.adiciona(new Produto("Liquidificador", 250.0));
		cc.adiciona(new Produto("Jogo de Pratos", 70.0));
		
		MaiorEMenor mm = new MaiorEMenor();
		
		mm.encontra(cc);
		
		Assert.assertEquals("Jogo de Pratos", mm.getMenor().getNome());
		Assert.assertEquals("Geladeira", mm.getMaior().getNome());
		
	}

}
