package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Quantos Produtos serão?: ");
		int n = entrada.nextInt();
		entrada.nextLine();

		ArrayList<Produto> produtos = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Seu produto é cumum, usado ou importado?(c/u/i)");
			String r = entrada.nextLine().toLowerCase().trim();
			if (r.equals("c")) {
				System.out.println("Nome do produto comum: ");
				String nome = entrada.nextLine();

				System.out.println("Preço do produto comum: ");
				double preco = entrada.nextDouble();
				entrada.nextLine();

				Produto pc1 = new Produto(nome, preco);

				produtos.add(pc1);

			} else if (r.equals("u")) {
				System.out.println("Nome do produto usado: ");
				String nome = entrada.nextLine();

				System.out.println("Preço do produto usado: ");
				double preco = entrada.nextDouble();
				entrada.nextLine();

				System.out.println("Qual data de fabricação? (dd/MM/yyyy): ");
				DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				String data = entrada.nextLine();
				LocalDate dataFabricacao = LocalDate.parse(data, fmt1);

				Produto pu1 = new ProdutoUsado(nome, preco, dataFabricacao);
				produtos.add(pu1);

				produtos.add(pu1);
			} else if (r.equals("i")) {
				System.out.println("Nome do produto importado: ");
				String nome = entrada.nextLine();

				System.out.println("Preço do produto importado: ");
				double preco = entrada.nextDouble();
				entrada.nextLine();

				System.out.println("Qual valor da taxa alfandegária?: ");
				double taxa = entrada.nextDouble();
				entrada.nextLine();

				Produto pi1 = new ProdutoImportado(nome, preco, taxa);
				produtos.add(pi1);

			}
		}
		System.out.println("Etique de preços: ");
		for(int i = 0; i < produtos.size(); i++) {
			System.out.println(produtos.get(i).etiquetaDePreco()); 
		}

	}

}
