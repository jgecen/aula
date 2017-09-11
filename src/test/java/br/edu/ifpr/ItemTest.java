package br.edu.ifpr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void testValorVenda() {
		Item item = new Item("Mouse", 1, 5.0, 100.0, Item.Tipo.PRODUTO);

		assertEquals(11.0, item.valorVenda(), 0.0);
		
		Item item2 = new Item("Backup", 1, 20, 100.0, 
				Item.Tipo.SERVICO);		

		assertEquals(41.0, item2.valorVenda(), 0.0);
		
	}

	@Test
	public void testSubTotal() {
		Item item = new Item("Mouse", 2, 5.0, 100.0, Item.Tipo.PRODUTO);

		assertEquals(22.0, item.subTotal(), 0.0);
		
		Item item2 = new Item("Backup", 2, 20, 100.0, 
				Item.Tipo.SERVICO);		

		assertEquals(82.0, item2.subTotal(), 0.0);

	}

}
