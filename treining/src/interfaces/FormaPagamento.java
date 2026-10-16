package interfaces;

public interface FormaPagamento {
	public double calcularTaxa(double valor);
	public double  pagar(double valor);

}
