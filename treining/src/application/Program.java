package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enumeracao.StatusPedido;

public class Program {

	public static void main(String[] args) {
		LocalDateTime horaAtualIso = LocalDateTime.now();
		Scanner entrada = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Nome: ");
		String nome = entrada.nextLine();

		System.out.println("Email: ");
		String email = entrada.nextLine();

		System.out.println("Data de Nascimento(dd/MM/yyyy): ");
		String dtn = entrada.nextLine();

		LocalDate dataDeNascimento = LocalDate.parse(dtn, fmt1);

		Cliente cliente = new Cliente(nome, email, dataDeNascimento);

		System.out.println("Insira os dados do pedido.");
		System.out.println("Status: ");

		StatusPedido status = StatusPedido.valueOf(entrada.nextLine().toUpperCase());

		System.out.println("Quantos itens tem o pedido?: ");
		int n = entrada.nextInt();
		entrada.nextLine();

		Pedido pedido = new Pedido(horaAtualIso, status);

		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do item número " + i + 1);

			System.out.println("Nome do item?: ");
			String nomePedido = entrada.nextLine();

			System.out.println("Qual preço do item?: ");
			double preco = entrada.nextDouble();
			entrada.nextLine();

			System.out.println("Qual quantidade de item?: ");
			int quantidade = entrada.nextInt();
			entrada.nextLine();

			Produto produto = new Produto(nomePedido, preco);

			ItemPedido item = new ItemPedido(quantidade, preco, produto);

			pedido.addItem(item);

		}

		System.out.println("Resumo do pedido: ");

		System.out.println("Momento do pedido: " + horaAtualIso.format(fmt1));
		System.out.println("Status do pedido: " + status);
		System.out.println("Cliente: " + cliente.getNome() + "(" + cliente.getDataDeNascimento() + ") " + "- "
				+ cliente.getEmail());
		System.out.println("Itens do pedido: ");

		for (int i = 0; i < pedido.somarItens(); i++) {

			System.out.println(pedido.acessarNome(i) + ", " + "$" + pedido.lerPreco(i) + " Quantidade: "
					+ pedido.lerQuantidade(i) + " SubTotal: " + "$" + pedido.acessarSubTotal(i));
		}
		System.out.println("Preço total: " + "R$" + pedido.total());

	}

}
