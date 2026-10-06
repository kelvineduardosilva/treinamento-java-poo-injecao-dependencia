package entities;

import exceptions.ExceptionContaBancaria;

public class ContaBancaria {
	private int numero;
	private String titular;
	private double saldo;
	private double limiteSaque;

	public ContaBancaria() {
	}

	public ContaBancaria(int numero, String titular, double saldo, double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public Double saque(double saque) throws ExceptionContaBancaria {
		if(saque > saldo) {
			throw new ExceptionContaBancaria("Saldo insuficiente");
		}
		else if(saque > limiteSaque) {
			throw new ExceptionContaBancaria("Erro: o saque é maior que o limite de saque.");
		}
		return saldo -= saque;

	}

}
