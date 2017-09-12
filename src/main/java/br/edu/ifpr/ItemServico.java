package br.edu.ifpr;

public class ItemServico extends ItemAbstract implements Item {

	private static final double ISS = 0.025;
	
	
	public ItemServico(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Override
	public double valorVenda() {
		double custoComImposto = (produto.getCusto() * ISS) + produto.getCusto();
		
		double valorVenda = 
				((produto.getPorcentagemLucro()/100) * custoComImposto)
				+ custoComImposto;
		return valorVenda;

	}


}
