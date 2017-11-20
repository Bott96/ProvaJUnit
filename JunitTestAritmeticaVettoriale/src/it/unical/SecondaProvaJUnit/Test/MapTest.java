package it.unical.SecondaProvaJUnit.Test;

import org.junit.*;

import it.unical.SecondaProvaJUnit.MapDiQualcosa;

public class MapTest {

	private static MapDiQualcosa c = new MapDiQualcosa();

	@Test
	public void addTest() {

		c.addElem(2, "Salvo");
		c.addElem(1, "Bott");
		c.addElem(3, "Checcah");
		Assert.assertEquals(3, c.getSize());

	}

	@Test
	public void removeTest() {


		c.addElem(1, "Bott");
		int sizeAttuale = c.getSize();

		c.remove(1);

		Assert.assertEquals(sizeAttuale - 1, c.getSize());

	}

	@Test(expected = RuntimeException.class)
	public void removeTestForEccezione() {
		c.remove(1);
		c.remove(2);	
		c.remove(3);
		c.remove(4);

			
	}

}
