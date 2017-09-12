package br.edu.ifpr;

public abstract class ItemAbstract implements Item {

	protected Produto produto = new Produto();
	protected int quantidade;

	public ItemAbstract() {
		super();
	}

	
	public double subTotal() {
		return quantidade * valorVenda();
	}

	
	public int quantidade() {		
		return quantidade;
	}

	
	public String descricao() {
		return produto.getDescricao();
	}

}