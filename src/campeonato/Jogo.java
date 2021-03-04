package campeonato;

import java.util.InputMismatchException;

public class Jogo {

	private Time timeA;
	private Time timeB;
	
	public Jogo(Time timeA, Time timeB) {
		super();
		if(timeA.equals(timeB)) {
			throw new InputMismatchException("Um time não pode jogar contra ele mesmo!");
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
	 * Veja que o resultado de um jogo só deve ser setado uma única vez.
	 * Aqui não estou tratando o caso de se fazer um novo ajuste
	 * Também seria necessário garantir a execução conjunta das ações (para evitar
	 * inconsistência dos dados). Ex: falta energia na hora da execução da linha 44.
	 */
	public void setResultado(int golsA, int golsB) {
		
		//atualiza pontuação
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
