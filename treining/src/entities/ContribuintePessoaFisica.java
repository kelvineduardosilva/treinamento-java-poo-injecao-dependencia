package entities;

public class ContribuintePessoaFisica extends Contribuinte {
	private Double gastoComSaude;
	
	public ContribuintePessoaFisica() {
		super();
	}
	public ContribuintePessoaFisica(String nome, double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}
	public Double getGastoComSaude() {
		return gastoComSaude;
	}
	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}
	@Override
	public double calcularImposto() {
		if(super.getRendaAnual() < 20000) {
			double imposto = super.getRendaAnual() * 0.15;
			return imposto;
		}
		else if(super.getRendaAnual() >= 20000 && gastoComSaude != 0) {
			double imposto = (super.getRendaAnual() * 0.25) - (gastoComSaude * 0.50);
			return imposto;
		}
		else{
			double imposto = super.getRendaAnual() * 0.25;
			return imposto;
		}
		
		
	}
	

}
