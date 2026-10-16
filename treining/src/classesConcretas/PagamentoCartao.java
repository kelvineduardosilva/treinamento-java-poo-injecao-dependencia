package classesConcretas;

import interfaces.FormaPagamento;

public class PagamentoCartao implements FormaPagamento {
	@Override
	public double calcularTaxa(double valor) {
		double taxa =  valor * 0.03;
		return taxa;
	}
	@Override
	public double pagar(double valor) {
		return valor + calcularTaxa(valor);
	}

}
