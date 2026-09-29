package entities;

public class ItemPedido {
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public ItemPedido(){
	}

	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double subTotal() {
		
		return preco * quantidade;
		
	}
	public String lerNome() {
		String nome = produto.getNome();
		return nome;
	}



	
	

}
