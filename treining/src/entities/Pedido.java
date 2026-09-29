package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import entities.enumeracao.StatusPedido;

public class Pedido {
	private LocalDateTime momento;
	private StatusPedido status;
	
	private ArrayList<ItemPedido> item = new ArrayList<>();
	 
	public Pedido(){
	}

	public Pedido(LocalDateTime momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}
	
	public void addItem(ItemPedido item) {
		this.item.add(item);
	}
	public void removeItem(ItemPedido item) {
		this.item.remove(item);
	}
	
	public Double total() {
		Double soma = 0.0;
		for(ItemPedido it : item) {
			soma += it.getPreco();			
		}
		
		return soma;
	}
	public int somarItens() {
		int soma = 0;
		for(ItemPedido it : item) {
			soma += 1;			
		}
		return soma;
	}
	public int lerQuantidade(int i) {
		return item.get(i).getQuantidade();
	
	}
	public Double lerPreco(int i) {
		return item.get(i).getPreco();
	
	}
	
	public String acessarNome(int i) {
		 return item.get(i).lerNome();
	}
	public double acessarSubTotal(int i) {
		return item.get(i).subTotal();
	}




}
