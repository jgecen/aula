package br.edu.ifpr;

import java.util.ArrayList;
import java.util.List;

public class ItemKit implements Item {

	private List<Item> itens = new ArrayList<>();
	
	public void add(Item item){
		itens.add(item);
	}
	public void remove(int index){
		itens.remove(index);
	}
	
	
	@Override
	public double valorVenda() {
		
		double soma = 0;
		for (Item item : itens) {
			soma += item.valorVenda();
		}
		return soma;
		
		 
	}

	@Override
	public double subTotal() {
		return itens.stream().mapToDouble(Item::subTotal).sum();
	}

	@Override
	public int quantidade() {
		return 0;
	}

	@Override
	public String descricao() {
		return null;
	}

}
