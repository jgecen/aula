package br.edu.ifpr;

public class Produto {
	private String descricao;
	private double custo;
	private double porcentagemLucro;

	public Produto(String descricao, double custo, double porcentagemLucro) {
		super();
		this.descricao = descricao;
		this.custo = custo;
		this.porcentagemLucro = porcentagemLucro;
	}

	public Produto() {
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getPorcentagemLucro() {
		return porcentagemLucro;
	}

	public void setPorcentagemLucro(double porcentagemLucro) {
		this.porcentagemLucro = porcentagemLucro;
	}
}