package it.unical.testJuint;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.unical.testContoCorrent.ContoCorrente;

public class testJUNIT {
	
	//Creare un istanza della classe, 
	/*
	 * 
	 * 
	 * verificare che il conto corrente abbia conto 0 all'inizio
	 * 
	 * test, per la funzione deposita...
	 * 
	 * test per la funzione preleva..
	 * 
	 * test suite..
	 * 
	 * */

	
	private static ContoCorrente c = new ContoCorrente();
	
	@Before
	public void seContoAllInizioEZeroTest(){
		
		Assert.assertEquals(0 , c.getSaldo() );
		
	}
	
	
	@Test
	public void depositaSoldiSulContoTest(){
		
		int importo =500;
		c.deposita(importo);
		Assert.assertEquals(importo , c.getSaldo());
		
		c.deposita(importo);
		Assert.assertEquals(importo+importo , c.getSaldo());
		
		
	}
	
	
	@After 
	public void prelevaSoldiSulContoTest(){
		int importo =500;

		c.preleva(importo);

		c.preleva(importo);
		Assert.assertEquals(0 , c.getSaldo());
		
		
		
	}
	
	
	
	
	
}
