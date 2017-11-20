package it.unical.TerzaProvaJUnit.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import it.unical.TerzaProvaJUnit.SuperEroi;


@RunWith(value = Parameterized.class)
public class ParametricTest {

	private String eroe;
	private boolean esiste;
	private static SuperEroi su;

	public ParametricTest(String e, boolean b) {

		this.eroe = e;
		esiste =b;

	}

	@BeforeClass
	public static void initClass() {
		su = new SuperEroi();

		su.addSuperEroe("Batman");
		su.addSuperEroe("CatWoman");
		su.addSuperEroe("Superman");
		su.addSuperEroe("Gulliver");

	}

	
	@Parameters
	public static Collection data(){
		
		Object[][] data = new Object[][] {{"Batman", true},{"CatWoman", true},{"Salvatore", false}};
		return Arrays.asList(data);
		
	}


	@Test
	public void isSuperEroeTest(){
		
		System.out.println(eroe);
		Assert.assertEquals(esiste, su.getEroe(eroe));
		
	}

}
