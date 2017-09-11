package br.edu.ifpr;

public class Item {

	
	private static final double ISS = 0.025;

	private static final double ICMS = 0.10;

	enum Tipo {PRODUTO, SERVICO};
	
	private String descricao;
	
	private int quantidade;
	
	private double custo;
	
	private double porcentagemLucro;
	
	private Tipo tipo;

	public Item(String descricao, 
			int quantidade, 
			double custo, 
			double porcentagemLucro,
			Tipo tipo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.custo = custo;
		this.porcentagemLucro = porcentagemLucro;
		this.tipo = tipo;
	}

	public double valorVenda(){
		double custoComImposto = 0;
		if(tipo.equals(Item.Tipo.PRODUTO)){
			custoComImposto = (custo * ICMS) + custo;	
		} else {
			custoComImposto = (custo * ISS) + custo;
		}
		
		double valorVenda = 
				((porcentagemLucro/100) * custoComImposto)
				+ custoComImposto;
		return valorVenda;
	}
	
	public double subTotal(){
		return quantidade * valorVenda();
	}
	
}