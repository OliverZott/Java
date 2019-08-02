/**
 * Example - InterestRates:
 * Variable declaration / Math.random 
 * 
 * @author:		Oliver Zott
 * @date: 		02.08.2019
 * @version:	1.0
 */


public class InterestRates {							// ONE public class per file - same name as file!

	/*
	class rdmCapital {
		double capital2 = Math.random()*10000;
		// System.out.println("tes");					// can't use methode while declaring for class!
		// return capital2;								// not working!
	}
	*/
	
	public static void main(String[] args) {
		
		double capital = Math.random()*10000;
		System.out.println("random kapital: " + capital);
		//double capital 			= 15000 /* Euro */;
		double interestRate		= 3.6 /* Prozent */;
		double totalinterestRate = capital * interestRate / 100; // Jahr 1
		//System.out.print("Zinsen nach einem Jahr: ");
		//System.out.print( totalinterestRate);
		System.out.println("Zinsen nach einem Jahr: " + totalinterestRate);
		
	}
}
