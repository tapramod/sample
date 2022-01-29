package main;

public class Vodafone implements Sim{

	@Override
	public void calling() {
	
		System.out.println("calling using vodaFone sim card");
		
	}

	@Override
	public void data() {
	System.out.println("browing internet using vodafone sim");
		
	}

}
