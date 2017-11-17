package it.unical.testContoCorrent;

public class ContoCorrente {
	
	private int saldo;
	
	public ContoCorrente() {
		saldo=0;
	}
	
	public void deposita(int importo)throws IllegalArgumentException
	{
		if(importo>0)
			saldo+=importo;
		else
			throw new IllegalArgumentException("Importo inserito negativo");
	}
	
	public void preleva(int importo) throws IllegalArgumentException{
		
		if(importo<=saldo)
			saldo-=importo;
		else
			throw new IllegalArgumentException("Sei un poveraccio..");
	}
	
	public int getSaldo(){
		return saldo;
	}
	
	
	public static void main(String[] args) {
		
		ContoCorrente c = new ContoCorrente();

		c.deposita(1000);

		c.preleva(1000);
		
		System.out.println(c.getSaldo());
		
	}
	

}
