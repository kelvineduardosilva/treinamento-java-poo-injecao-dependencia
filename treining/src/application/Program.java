package application;
import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;
import exceptions.ExceptionContaBancaria;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Entre com os dados da conta: ");
		
		System.out.println("Número da conta: ");
		int numeroConta = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Titular da conta: ");
		String titular = entrada.nextLine();
		
		System.out.println("Saldo inicial: ");
		double saldoInicial = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Qual limite de saque?: ");
		double limiteSaque = entrada.nextDouble();
		entrada.nextLine();
		
		ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldoInicial, limiteSaque); 
		try {
			System.out.println("Qual valor de saque?: ");
			double saque = entrada.nextDouble();
			entrada.nextLine();
			
			conta.saque(saque);
			
			System.out.println("Saldo atualizado: " + conta.getSaldo());
		}
		catch(ExceptionContaBancaria e) {
			System.out.println(e.getMessage());
		}
		
	}
}
