package br.edu.ifpr;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void testAdicionar() {
		Orcamento orcamento = new Orcamento();		
		//22
		ItemProduto item = new ItemProduto("Mouse", 2, 
				5.0, 100.0);
		orcamento.adicionar(item);
		assertEquals(22.0, orcamento.total(), 0.0);
		
		//82
		Item item2 = new ItemServico(new Produto("Backup", 20, 100.0 ), 2  );		
		orcamento.adicionar(item2);
		assertEquals(104.0, orcamento.total(), 0.0);
	}

	@Test
	public void testRemover() {
		fail("Not yet implemented");
	}

}
