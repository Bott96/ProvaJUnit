package it.unical.testContoCorrent;

public class ContoCorrente {
	
	private int saldo;
	
	public ContoCorrente() {
		saldo=0;
	}
	
	void deposita(int importo)
	{
		if(importo>0)
			saldo+=importo;
		else
			throw new RuntimeException("Importo inserito negativo");
	}
	
	public void preleva(int importo){
		
		if(importo<=saldo)
			saldo-=importo;
		else
			throw new RuntimeException("Sei un poveraccio..");
	}
	
	public int getSaldo(){
		return saldo;
	}
	

}
