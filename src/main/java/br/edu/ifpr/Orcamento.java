package br.edu.ifpr;

import java.util.ArrayList;
import java.util.Collection;

public class Orcamento {

	private Collection<Item> itens = new ArrayList<>();

	private double total;
	
	public void adicionar(Item item){
		itens.add(item);
		total += item.subTotal();
	}
	
	public void remover(int indice){
		
	}

	public double total() {
		return total;
	}
}
