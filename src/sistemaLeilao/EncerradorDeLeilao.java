package sistemaLeilao;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

public class EncerradorDeLeilao {

	private int total = 0;
	public void encerra() {
		LeilaoDao dao = new LeilaoDao();
		List<Leilao> todosLeiloesCorrentes = dao.correntes();
	
		for(Leilao leilao : todosLeiloesCorrentes) {
			if(comecouSemanaPassada(leilao)) {
				leilao.encerra();
				total++;
				dao.atualiza(leilao);
			}
		}
	}
	
	private boolean comecouSemanaPassada(Leilao leilao) {
		return diasEntre(leilao.getData(), Calendar.getInstance()) >= 7;
	}
	
	private int diasEntre(Calendar inicio, Calendar fim) {
		Calendar data = (Calendar) inicio.clone();
		int diasNoIntervalo = 0;
		while (data.before(fim)) {
			data.add(Calendar.DAY_OF_MONTH, 1);
			diasNoIntervalo++;
		}
		return diasNoIntervalo;
	}
	
	public int getTotalEncerrados() {
		return total;
	}
	
	public static void main(String[] args) {
		
		LocalDate onzeSetembro = LocalDate.of(2001, 9, 11);
		LocalDate hoje = LocalDate.of(2019, 1, 1);
		
		long dias = Duration.between(onzeSetembro.atStartOfDay(), hoje.atStartOfDay()).toDays();
		System.out.println(dias);
	}
}
