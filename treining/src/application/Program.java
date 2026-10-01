package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.ContribuintePessoaFisica;
import entities.ContribuintePessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantos contribuintes serão?: ");
		int n = entrada.nextInt();
		entrada.nextLine();

		ArrayList<Contribuinte> contribuintes = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("O contribuinte " + (i + 1) + " é pessoa fisica ou juridica?(f/j): ");
			String r = entrada.nextLine().toLowerCase().trim();
			if (r.equals("f")) {
				System.out.println("Qual seu nome?: ");
				String nome = entrada.nextLine();

				System.out.println("Qual sua renda anual?: ");
				double rendaAnual = entrada.nextDouble();
				entrada.nextLine();

				System.out.println("Qual seu gasto com saude?: ");
				double gastoComSaude = entrada.nextDouble();
				entrada.nextLine();

				Contribuinte pessoaFisica = new ContribuintePessoaFisica(nome, rendaAnual, gastoComSaude);

				contribuintes.add(pessoaFisica);
			} else if (r.equals("j")) {
				System.out.println("Qual seu nome?: ");
				String nome = entrada.nextLine();

				System.out.println("Qual sua renda anual?: ");
				double rendaAnual = entrada.nextDouble();
				entrada.nextLine();

				System.out.println("Qual seu número de funcionário?: ");
				int funcionarios = entrada.nextInt();
				entrada.nextLine();

				Contribuinte pessoaJuridica = new ContribuintePessoaJuridica(nome, rendaAnual, funcionarios);

				contribuintes.add(pessoaJuridica);
			}
		}
		System.out.println("IMPOSTOS PAGOS: ");
		double totalTaxas = 0.0;
		for(int  i = 0; i < contribuintes.size(); i++) {
			System.out.println(contribuintes.get(i).getNome() + ": " + "$ " + contribuintes.get(i).calcularImposto());
			totalTaxas += contribuintes.get(i).calcularImposto();
		}
		System.out.println("Taxa total: " + totalTaxas);
	}
}
