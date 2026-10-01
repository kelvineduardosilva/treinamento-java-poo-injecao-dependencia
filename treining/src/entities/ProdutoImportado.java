package entities;

public class ProdutoImportado extends Produto {
	private double taxaAlfandegaria;

	public ProdutoImportado() {
		super();
	}
	public ProdutoImportado(String name, Double preco, double taxaAlfandegaria) {
		super(name, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	public double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}
	public void setTaxaAlfandegaria(double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	public Double precoTotal() {
		double preco = super.getPreco();
		double soma = preco + taxaAlfandegaria;
		return soma;
	}
	@Override
	public String etiquetaDePreco() {
		String etiqueta = super.getName() + " $ " + precoTotal() + " (Taxa alfandegária: $" + taxaAlfandegaria +")";
		return etiqueta;
		 
	}
	
	
	

}
