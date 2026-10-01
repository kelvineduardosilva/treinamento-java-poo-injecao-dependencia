package entities;

import java.time.LocalDate;

public class ProdutoUsado extends Produto {
	private LocalDate dataFabricacao;
	
	public ProdutoUsado(){
		super();
	}
	public ProdutoUsado(String name, Double preco, LocalDate dataFabricacao) {
		super(name, preco);
		this.dataFabricacao = dataFabricacao;
	}
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	@Override
	public String etiquetaDePreco() {
		String etiqueta = super.getName() + "(Usado)" + " $ " + super.getPreco() + " (Data de fabricação: " + dataFabricacao + ")";
		return etiqueta;
	}
	
}
