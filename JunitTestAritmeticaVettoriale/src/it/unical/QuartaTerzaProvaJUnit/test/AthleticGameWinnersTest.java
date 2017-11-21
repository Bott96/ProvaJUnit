package it.unical.QuartaTerzaProvaJUnit.test;

import java.time.Instant;

import org.junit.*;

import it.unical.QuartaTerzaProvaJUnit.AthleticGame;

public class AthleticGameWinnersTest {
	
	private static AthleticGame ag;
	
	@BeforeClass
	public static void initG(){
		ag = new AthleticGame("Mooosecaaa");
		
	}
	
	@After
	public void resetTest(){
		ag.reset();
	}
	
	@Before
	public void startTest(){
		
		ag.start();
	}
	
	
	@Test
	public void getWinnerTest(){
		ag.addArrival("Bott", Instant.now().plusMillis(2000));
		ag.addArrival("Mich", Instant.now().plusMillis(3000));
		ag.addArrival("Checcah", Instant.now().plusMillis(1900));
		
		Assert.assertEquals("Checcah", ag.getWinner());
		
		
	}
	

}
