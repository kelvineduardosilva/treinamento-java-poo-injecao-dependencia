package application;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Linhas: ");
		int linhas = entrada.nextInt();

		System.out.println("Colunas: ");
		int colunas = entrada.nextInt();

		int[][] mat = new int[linhas][colunas];

		for (int i = 0; i < mat.length; i++) {
			for (int v = 0; v < mat[i].length; v++) {
				System.out.println("Número " + (i + 1));
				mat[i][v] = entrada.nextInt();

			}
		}

		System.out.println("Qual valor a ser buscado?: ");
		int buscarValor = entrada.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int v = 0; v < mat[i].length; v++) {

				if (mat[i][v] == buscarValor) {
					System.out.println("Posição: " + i + "," + v);
					if (v > 0 && mat[i][v - 1] != 0) {
						System.out.println("Left: " + mat[i][v - 1]);
					}
					if (v < mat[i].length - 1 && mat[i][v + 1] != 0) {
						System.out.println("right: " + mat[i][v + 1]);
					}
					if(i > 0 && mat[i-1][v] != 0) {
						System.out.println("up: " + mat[i-1][(v)]);
					}
					if(i < mat.length - 1 && mat[i + 1][v] != 0) {
						System.out.println("down: " + mat[i+1][v]);
					}
			
				}

			}
		}

	}

}
