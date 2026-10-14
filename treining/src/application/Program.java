package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String caminho = "C:/Users/kelvi/OneDrive/Documentos/exfiles/produtos.csv.txt";
        String caminhoSaida = "C:/Users/kelvi/OneDrive/Documentos/exfiles/out/soma.csv.txt";


        try (
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            FileWriter fw = new FileWriter(caminhoSaida, true)
        ) {

            String line = br.readLine();

            while (line != null) {

                String[] dados = line.split(",");

                float preco = Float.parseFloat(dados[1]);
                int quantidade = Integer.parseInt(dados[2]);

                float valorTotal = preco * quantidade;

                fw.write(dados[0] + "," + valorTotal);
                fw.write(System.lineSeparator());

                line = br.readLine();
                fw.close();
            }

        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
            return;
        }

        try (BufferedReader br1 = new BufferedReader(new FileReader(caminhoSaida))) {

            String linha = br1.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br1.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de saída: " + e.getMessage());
        }
    }
}