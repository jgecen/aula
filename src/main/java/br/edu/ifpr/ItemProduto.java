package br.edu.ifpr;

public class ItemProduto extends ItemAbstract implements Item {

	private static final double ICMS = 0.10;
	
	public ItemProduto(String descricao, 
			int quantidade, 
			double custo, 
			double porcentagemLucro) {
		this.produto.setDescricao(descricao);
		this.quantidade = quantidade;
		this.produto.setCusto(custo);
		this.produto.setPorcentagemLucro(porcentagemLucro);
	}

	@Override
	public double valorVenda(){
		double custoComImposto = 
				(produto.getCusto() * ICMS) + produto.getCusto();
		double valorVenda = 
				((produto.getPorcentagemLucro()/100) 
						* custoComImposto)
				+ custoComImposto;
		return valorVenda;
	}
	
}