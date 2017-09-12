package br.edu.ifpr;

public interface Item {

	enum Tipo {PRODUTO, SERVICO};
	
	double valorVenda();

	double subTotal();

	int quantidade();
	
	String descricao();
}