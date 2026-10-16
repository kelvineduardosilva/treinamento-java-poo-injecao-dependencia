package classesConcretas;

import interfaces.FormaPagamento;

public class PagamentoPix implements FormaPagamento {
	@Override
	public double calcularTaxa(double valor) {
		double taxa = 0.0;
		return taxa;
	}
	@Override
	public double pagar(double valor) {
		return valor + calcularTaxa(valor);
	}

}
