package application;

import java.util.Scanner;

import classesConcretas.NotificadorEmail;
import classesConcretas.NotificadorSms;
import interfaces.Notificador;
import servicos.ServicoNotificador;

public class Program {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Por onde desejada ser notificado?: (E-mail : 1 - SMS : 2)");
		int d = entrada.nextInt();
		entrada.nextLine();

		Notificador notificadorEmail = new NotificadorEmail();
		Notificador notificadorSms = new NotificadorSms();

		if (d == 1) {
			ServicoNotificador serviconotificador = new ServicoNotificador(notificadorEmail);
			System.out.println(serviconotificador.notificar());
		}
		else if(d == 2) {
			ServicoNotificador serviconotificador = new ServicoNotificador(notificadorSms);
			System.out.println(serviconotificador.notificar());
		}

	}
}
