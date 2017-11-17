package it.unical.testJuint;

import org.junit.Assert;
import org.junit.Test;

import it.unical.testContoCorrent.ContoCorrente;

public class SomeAnotherTest {
	
	
	@Test
	public void multiAddOnContoTest(){
		
	
		 ContoCorrente c = new ContoCorrente();
		ContoCorrente c1 = new ContoCorrente();
		

		c.deposita(500);
		c1.deposita(700);
		
		c1.deposita(200);
		c.preleva(200);

		Assert.assertEquals(700+200 , c1.getSaldo() );
		Assert.assertEquals(500-200 , c.getSaldo() );
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void exceptionTest() {

		 ContoCorrente c = new ContoCorrente();
		 c.preleva(500);
		
	}

}
