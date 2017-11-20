package it.unical.TerzaProvaJUnit.test;

import org.junit.*;

import it.unical.TerzaProvaJUnit.SuperEroi;

public class TestSuperEroeList {

	static SuperEroi su;

	@BeforeClass
	public static void initTest() {
		System.out.println("Init Test");
		su = new SuperEroi();
	}

	@Test
	public void addSuperEroeTest() {

		
		su.addSuperEroe("Bott");
		Assert.assertEquals(1, su.getSize());

	}
	
	
	@Test
	public void getSuperEroeValueTest(){
		
		String s ="Bott";
		Assert.assertEquals(s, su.getSuperEroe(0));
		
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void getSuperEroeExceptionTest(){
		
		String s =su.getSuperEroe(10);
	}
	
	

	
	
}
