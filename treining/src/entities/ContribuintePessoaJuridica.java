package entities;

public class ContribuintePessoaJuridica extends Contribuinte {
	private int funcionarios;

	public ContribuintePessoaJuridica() {
		super();
	}

	public ContribuintePessoaJuridica(String nome, double rendaAnual, int funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	@Override
	public double calcularImposto() {
		if(funcionarios > 10) {
			double imposto = super.getRendaAnual() * 0.14;
			return imposto;
		}
		else {
			double imposto = super.getRendaAnual() * 0.16;
			return imposto;
		}
	}

}
