package entities;

public class FuncionarioTerceirizado extends Funcionario {
	private Double despesaAdicional;
	
	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	@Override
	public double valorSario() {
		double soma = super.valorSario();
		soma += (despesaAdicional * 110) / 100;
		return soma;
	}
	

	
	
}
