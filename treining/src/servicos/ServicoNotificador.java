package servicos;

import interfaces.Notificador;

public class ServicoNotificador {
	public Notificador notificador;
	
	public ServicoNotificador(Notificador notificador){
		this.notificador = notificador;
	}
	public String notificar() {
		return notificador.enviar();
	}

}
