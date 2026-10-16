package application;
import java.util.Scanner;
import classesConcretas.PagamentoBoleto;
import classesConcretas.PagamentoCartao;
import classesConcretas.PagamentoPix;
import entities.Produto;
import interfaces.FormaPagamento;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual nome do produto?: ");
		String nome = entrada.nextLine();

		System.out.println();

		System.out.print("Qual preço do produto?: ");
		Double valor = entrada.nextDouble();
		entrada.nextLine();

		System.out.println();

		Produto produto = new Produto(nome, valor);

		boolean controle = true;
		int fp = 0;
		String fmpg = "";
		FormaPagamento formapagamento = null;
		double total = 0.0;
		while (controle) {

			System.out.println("Qual forma de pagamento?: (pix: 1, cartão: 2, boleto: 3)");
			fp = entrada.nextInt();
			entrada.nextLine();
			
			if (fp == 1) {
				formapagamento = new PagamentoPix();
				total = formapagamento.pagar(valor);
				fmpg = "Pix";
				controle = false;
			} else if (fp == 2) {
				formapagamento = new PagamentoCartao();
				total = formapagamento.pagar(valor);
				fmpg = "Cartão";
				controle = false;
			} else if (fp == 3) {
				formapagamento = new PagamentoBoleto();
				total = formapagamento.pagar(valor);
				fmpg = "Boleto";
				controle = false;
			}
			else {
				System.out.println("Opção inválida! Escolha entre: (pix: 1, cartão: 2, boleto: 3)");
			}
			
		}
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço do produto: " + produto.getPreco());
		System.out.println("Forma de pagamento escolhida " + fmpg + " (" + fp + ")");
		System.out.println("Total a ser pago: " + total);

	}

}
