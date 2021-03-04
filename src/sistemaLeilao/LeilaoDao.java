package sistemaLeilao;

import java.util.ArrayList;
import java.util.List;

public class LeilaoDao {

	List<Leilao> correntes;
	
	public List<Leilao> correntes() {
		return correntes;
	}

	public void setCorrentes(List<Leilao> correntes) {
		this.correntes = correntes;
	}

	public LeilaoDao() {
		correntes = new ArrayList<Leilao>();
	}

	public void atualiza(Leilao leilao) {
		// atualiza o Leilao no BD
	}
	
	
}
