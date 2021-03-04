package campeonato;

public class Time implements Comparable<Time>{

	private String nome;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int golsFeitos;
	private int golsSofridos;
	private int saldoGols;
	private int pontuacao;
	
	public Time(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getGolsFeitos() {
		return golsFeitos;
	}

	public void setGolsFeitos(int golsFeitos) {
		this.golsFeitos = golsFeitos;
	}

	public int getGolsSofridos() {
		return golsSofridos;
	}

	public void setGolsSofridos(int golsSofridos) {
		this.golsSofridos = golsSofridos;
	}

	public int getSaldoGols() {
		return getGolsFeitos() - getGolsSofridos();
	}

//	public void setSaldoGols(int saldoGols) {
//		this.saldoGols = saldoGols;
//	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public boolean equals(Time outro) {
		return this.getNome().equals(outro.getNome());
	}

	@Override
	public int compareTo(Time outro) {
		return this.pontuacao > outro.getPontuacao() ? 1 :
			this.pontuacao < outro.getPontuacao() ? -1 :
				this.vitorias > outro.getVitorias() ? 1 :
					this.vitorias < outro.getVitorias() ? -1 : 0;
				//poderia continuar comparando (terceiro critério de desempate)...
	}
	
	public String toString() {
		return this.getNome() + "\t"+this.getPontuacao()
							+ "\t"+this.getVitorias()
							+ "\t"+this.getDerrotas()
							+ "\t"+this.getEmpates()
							+ "\t"+this.getGolsFeitos()
							+ "\t"+this.getGolsSofridos()
							+ "\t"+this.getSaldoGols();
	}

}
