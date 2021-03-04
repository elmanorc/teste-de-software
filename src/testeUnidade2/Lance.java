package testeUnidade2;

public class Lance {

	private Usuario usuario;
	private double valor;
	
	
	public Lance(Usuario usuario, double valor) {
		super();
		this.usuario = usuario;
		this.valor = valor;
	}
	public Usuario getUsuario() {
		return this.usuario;
	}
	public String toString() {
		return usuario.toString();
	}
	public double getValor() {
		return valor;
	}
	
	
}
