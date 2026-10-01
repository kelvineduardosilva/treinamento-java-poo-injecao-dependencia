package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos Fúncionarios Serão?: ");
		int n = entrada.nextInt();
		entrada.nextLine();

		List<Funcionario> funcionarios = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("O fúncionario é terceirizado? (s/n)");
			String sn = entrada.nextLine().toLowerCase().trim();

			if (sn.equals("s")){
				System.out.println("Nome do fúncionario terceirizado: ");
				String nome = entrada.nextLine();

				System.out.println("Quantas horas trabalhadas?: ");
				int horasTrabalhadas = entrada.nextInt();
				entrada.nextLine();

				System.out.println("Qual valor por hora?: ");
				double valorPorHora = entrada.nextDouble();
				entrada.nextLine();

				System.out.println("Qual valor adicional?: ");
				double valorAdicional = entrada.nextDouble();
				entrada.nextLine();

				Funcionario f1t = new FuncionarioTerceirizado(nome, horasTrabalhadas, valorPorHora, valorAdicional);
				funcionarios.add(f1t);
			}

			else if (sn.equals("n")) {
				System.out.println("Nome do fúncionario: ");
				String nome = entrada.nextLine();

				System.out.println("Quantas horas trabalhadas?: ");
				int horasTrabalhadas = entrada.nextInt();
				entrada.nextLine();

				System.out.println("Qual valor por hora?: ");
				double valorPorHora = entrada.nextDouble();
				entrada.nextLine();
				Funcionario f1 = new Funcionario(nome, horasTrabalhadas, valorPorHora);
				funcionarios.add(f1);
			}
		}

		System.out.println("Pagamentos: ");

		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println(funcionarios.get(i).getNome() + " - $ " + funcionarios.get(i).valorSario());
		}

	}

}
