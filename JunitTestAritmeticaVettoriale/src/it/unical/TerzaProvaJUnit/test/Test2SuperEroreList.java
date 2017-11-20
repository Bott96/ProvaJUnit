package it.unical.TerzaProvaJUnit.test;

import org.junit.*;

import it.unical.TerzaProvaJUnit.SuperEroi;

public class Test2SuperEroreList {
	
	
	public static SuperEroi su ;
	
	@BeforeClass
	public static void InitData(){
	
		su= new SuperEroi();
		su.addSuperEroe("bott");
	}
	
	
	@Test
	public void removeValueTest(){
		
		su.removeSuper("bott");
		
		Assert.assertEquals(0,su.getSize());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void removeExceptionTest(){
		
		su.removeSuper("moooosecaa");
	}
	
	

}
