package main;

public class Mobile {

	public static void main(String[] args) {
		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();

		
		// if tomorrow i don't want to use airtel sim bcuz vodafone provide best deals with best deals
		//over here while we go to next sim card then again we have to change 
		//methods have prevoius class reference  =//		airtel.calling(); ==its called source codes
		//so for get rid of it
//		
//		Vodafone voda=new Vodafone();
//		voda.calling();
//		voda.data();
//	
		      
		// insted of it we can use interface reference
	//	Sim s = new Vodafone();     
		Sim s = new Airtel(); 
		s.calling();
		s.data();
		
	
	}

	
}
