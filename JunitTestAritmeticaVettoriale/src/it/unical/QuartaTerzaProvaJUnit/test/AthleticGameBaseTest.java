package it.unical.QuartaTerzaProvaJUnit.test;

import java.time.Instant;

import org.junit.*;

import it.unical.QuartaTerzaProvaJUnit.AthleticGame;

public class AthleticGameBaseTest {
	
	static AthleticGame at ;

	@BeforeClass
	public static void initAG(){
		
		at= new AthleticGame("Maratona");
	}
	
	
	@Test
	public void AddArrivalTest(){
		
		at.addArrival("Bott", Instant.now());
		
		Assert.assertEquals(1, at.getArrivals().size());
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getPartecipiantTimeTest(){
		
		at.getParecipiantTime("Michele");
		
	}
	
}
