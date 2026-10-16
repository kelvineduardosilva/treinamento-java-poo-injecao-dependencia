package classesConcretas;
import interfaces.Notificador;

public class NotificadorSms implements Notificador {
	public String enviar() {
		return "Enviando SMS: Seu pedido foi aprovado! ";
	}
}
