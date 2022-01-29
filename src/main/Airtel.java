package main;

public class Airtel implements Sim{

	@Override
	public void calling() {
	
		System.out.println("calling using airtel sim card");
		
	}

	@Override
	public void data() {
	System.out.println("browing internet using airtel sim");
		
	}

}
