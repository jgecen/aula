package br.edu.ifpr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void testValorVenda() {
		Item item = new ItemProduto("Mouse", 1, 5.0, 100.0);

		assertEquals(11.0, item.valorVenda(), 0.0);
		
		//Item item2 = new ItemServico("Backup", 1, 20, 100.0);
		Produto produto = new Produto("Backup", 20, 100.0 );
		Item item2 = new ItemServico(produto, 1);
		assertEquals(41.0, item2.valorVenda(), 0.0);
		
	}

	@Test
	public void testSubTotal() {
		Item item = new ItemProduto("Mouse", 2, 5.0, 100.0);

		assertEquals(22.0, item.subTotal(), 0.0);
				
		Item item2 = new ItemServico(new Produto("Backup", 20, 100.0 ), 2  );
		assertEquals(82.0, item2.subTotal(), 0.0);

	}

}
