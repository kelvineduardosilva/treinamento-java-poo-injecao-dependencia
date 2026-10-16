package classesConcretas;

import interfaces.Notificador;

public class NotificadorEmail implements Notificador {
	public String enviar() {
		return "Enviando e-mail: Seu pedido foi aprovado! ";
	}

}
