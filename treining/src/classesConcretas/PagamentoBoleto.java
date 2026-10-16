package classesConcretas;
import interfaces.FormaPagamento;

	public class PagamentoBoleto implements FormaPagamento {
		@Override
		public double calcularTaxa(double valor) {
			double taxa =  valor + 2.50;
			return taxa;
		}
		@Override
		public double pagar(double valor) {
			return valor + calcularTaxa(valor);
		}

	}


