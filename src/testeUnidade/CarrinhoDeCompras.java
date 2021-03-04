package testeUnidade;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> produtos;

	public CarrinhoDeCompras() {
		produtos = new ArrayList<Produto>();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adiciona(Produto produto) {
		produtos.add(produto);
	}
	
	
}
