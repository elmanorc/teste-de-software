package campeonato;

import java.util.InputMismatchException;

public class Jogo {

	private Time timeA;
	private Time timeB;
	
	public Jogo(Time timeA, Time timeB) {
		super();
		if(timeA.equals(timeB)) {
			throw new InputMismatchException("Um time n�o pode jogar contra ele mesmo!");
		}
		this.timeA = timeA;
		this.timeB = timeB;
	}
	
	public Time getTimeA() {
		return timeA;
	}
	public void setTimeA(Time timeA) {
		this.timeA = timeA;
	}
	public Time getTimeB() {
		return timeB;
	}
	public void setTimeB(Time timeB) {
		this.timeB = timeB;
	}
	
	/*
	 * Veja que o resultado de um jogo s� deve ser setado uma �nica vez.
	 * Aqui n�o estou tratando o caso de se fazer um novo ajuste
	 * Tamb�m seria necess�rio garantir a execu��o conjunta das a��es (para evitar
	 * inconsist�ncia dos dados). Ex: falta energia na hora da execu��o da linha 44.
	 */
	public void setResultado(int golsA, int golsB) {
		
		//atualiza pontua��o
		if(golsA > golsB) { //TimeA venceu
			
			timeA.setPontuacao(timeA.getPontuacao()+3);
			timeA.setVitorias(timeA.getVitorias()+1); //A venceu +1
			timeB.setDerrotas(timeB.getDerrotas()+1); //B perdeu +1
			
		} else if(golsA < golsB) { //TimeB venceu
			
			timeB.setPontuacao(timeB.getPontuacao()+3);
			timeB.setVitorias(timeB.getVitorias()+1); //B venceu +1
			timeA.setDerrotas(timeA.getDerrotas()+1); //A perdeu +1
			
		} else { //empate
			timeA.setPontuacao(timeA.getPontuacao()+1);
			timeB.setPontuacao(timeB.getPontuacao()+1);
			timeA.setEmpates(timeA.getEmpates()+1);
			timeB.setEmpates(timeB.getEmpates()+1);
		}
		
		//atualiza gols feitos e sofridos
		timeA.setGolsFeitos(timeA.getGolsFeitos() + golsA);
		timeA.setGolsSofridos(timeA.getGolsSofridos() + golsB);
		timeB.setGolsFeitos(timeB.getGolsFeitos() + golsB);
		timeB.setGolsSofridos(timeB.getGolsSofridos() + golsA);
	}
	
}
