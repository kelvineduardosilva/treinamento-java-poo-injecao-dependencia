package application;

import entities.FuncionarioExLista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioListaFuncionario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos funcionarios serão registrados?: ");
		int n = entrada.nextInt();
		entrada.nextLine();

		List<FuncionarioExLista> list = new ArrayList<>();
		
		int id = 0;
		
		boolean controle = true;
		
		for (int i = 0; i < n; i++) {
			System.out.println("funcionário " + (i + 1) + ":");
			while (controle) {
				System.out.println("Id: ");

				id = entrada.nextInt();
				entrada.nextLine();
				controle = false; // assume que o ID é válido
				for (FuncionarioExLista funcionario : list) {
					if (funcionario.getId() == id) {
						System.out.println("Id ja existente! digite outro.");
						controle = true;
;
					}
				}
			}
			controle = true;

			System.out.println("Nome: ");
			String nome = entrada.nextLine();

			System.out.println("Salário: ");
			double salario = entrada.nextDouble();
			
			entrada.nextLine();

			list.add(new FuncionarioExLista(id, nome, salario));

		}

		System.out.println("Qual id do funcionário que vai ter o salário editado?: ");
		int buscarId = entrada.nextInt();
		entrada.nextLine();

		FuncionarioExLista obj = list.stream().filter(x -> x.getId() == buscarId).findFirst().orElse(null);
		double acrescimo;
		if (obj == null) {
			System.out.println("Esse id não existe!");
			System.out.println("Lista de funcionários: ");

			for (FuncionarioExLista funcionario : list) {
				System.out.println(funcionario.getId() + ", " + funcionario.getNome() + ", " + funcionario.getSalario());
			}

		} else {
			System.out.println("Qual porcentagem será acrescentada ao salario?: ");
			 acrescimo = entrada.nextDouble();
			 for (FuncionarioExLista funcionario : list) {
				 if(funcionario.getId() == buscarId) {
					 double conta = funcionario.getSalario() * acrescimo / 100;
					 funcionario.setSalario(funcionario.getSalario() + conta);
				 }
			 }
			 for (FuncionarioExLista funcionario : list) {
					System.out.println(funcionario.getId() + ", " + funcionario.getNome() + ", " + funcionario.getSalario());
				}

		}

	}

}
