package testeUnidade;

public class Produto {

	private double valor;
	private String nome;

	public Produto(String nome, double valor) {
		this.valor=valor;
		this.nome=nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
