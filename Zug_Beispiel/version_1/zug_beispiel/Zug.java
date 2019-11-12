package zug_beispiel;

import java.util.HashSet;


/** Class Zug 
 * 
 * Zug which consists of:
 * Lokomotiven  1..*   
 * Wagon  0..* 
 * 
 * add builder function to: ensure 1..* lokomotive exists / if locomotives can pull / !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * implement train identification ?????????????????????????????????????
 * 
 * Provides:
 * 	- HashSets to store "Wagon" and "Lokomotive" objects
 * 	- Methods to add / remove "Wagon" and "Lokomotive" objects
 * 	- Methods to get various information about the train
 *  - Method to check traction is enough
 * 
 * @author Oliver Zott
 * @version 1.0
 */


public class Zug {
	
	/** HashSet to store elements of type Lokomotive and Wagon (elements not sorted/ordered) */
	private HashSet<Wagon> wagon_set = new HashSet<Wagon>();
	private HashSet<Lokomotive> lokomotive_set = new HashSet<Lokomotive>();
	
	private HashSet<Schienenfahrzeug> liste = new HashSet<Schienenfahrzeug>();
	
	
	/** Methods to add/remove wagons and locomotives to/from train 
	 * 
	 * Uses boolean attribute "verwendung" to ensure unique use of Lokomotive and Wagon elements
	 */
	public void addLokomotive( Lokomotive lokomotive ) {
		if( !lokomotive.isVerwendung() ) {
			lokomotive_set.add( lokomotive );
			lokomotive.setVerwendung(true);
		} else {
			System.out.println("Lokomotive '" + lokomotive.getSeriennummer() + "' already in use." );
		}
	}
	public void addWagon( Wagon wagon ) {
		if( !wagon.isVerwendung() ) {
			wagon_set.add(wagon);
			wagon.setVerwendung(true);
		} else {
			System.out.println("Wagon '" + wagon.getSeriennummer() + "' already in use." );
		}
	}
	public void delLokomotive( Lokomotive lokomotive ) {
		if( lokomotive_set.size() == 1 ) {
			System.out.println( "Achtung: Zug benötigt mindestens eine Lokomotive!" );
		} else {
			lokomotive_set.remove(lokomotive);
			lokomotive.setVerwendung(false);  // ensure lokomotive is not used anymore
		}
	}
	public void delWagon( Wagon wagon ) {
		wagon_set.remove(wagon);
		wagon.setVerwendung(false);  // wagon is not used anymore
	}
	
	
	
	/** 
	 * Methods to get information about the train 
	 * 
	 * uses getter methods of abstract base-class
	 */
	
	/* empty weight of whole trian */
	public double getLeergewicht() {
		double leergewicht_total = 0;
		for ( Wagon wagon : wagon_set ) {
			leergewicht_total += wagon.getLeergewicht();
		}
		for ( Lokomotive lokomotive : lokomotive_set ) {
			leergewicht_total += lokomotive.getLeergewicht();
		}
		return leergewicht_total;
	}
	
	/* maximum amount of passengers */
	public int getMaxPassagiere() {
		int passagiere_max = 0;
		for ( Wagon wagon : wagon_set ) {
			passagiere_max += wagon.getPassagiere_max();
		}
		for ( Lokomotive lokomotive : lokomotive_set ) {
			passagiere_max += lokomotive.getPassagiere_max();
		}
		return passagiere_max;
	}
	
	/* maximum amount of payload */
	public double getMaxZuladungGueter() {
		int zuladung_max = 0;
		for ( Wagon wagon : wagon_set ) {
			zuladung_max += wagon.getZuladungsgewicht_max();
		}
		for ( Lokomotive lokomotive : lokomotive_set ) {
			zuladung_max += lokomotive.getZuladungsgewicht_max();
		}
		return zuladung_max;
	}
	
	/* maximum amount of payload including passengers (assumed 75kg weight each) */
	public double getMaxZuladung() {
		double ladung_max = getMaxZuladungGueter() + getMaxPassagiere()*75;
		return ladung_max;
	}
	
	/* maximum weight overall */
	public double getMaxGewicht() {
		return getMaxZuladung() + getLeergewicht();
	}
	
	/* length of train */
	public double getLaenge() {
		double laenge = 0;
		for ( Wagon wagon : wagon_set ) {
			laenge += wagon.getLaenge();
		}
		for ( Lokomotive lokomotive : lokomotive_set ) {
			laenge += lokomotive.getLaenge();
		}
		return laenge;
	}
	
	/* check if locomotives can pull the train */
	public boolean fahrfaehig() {
		boolean canPull = false;
		double maxgewicht = getMaxGewicht();
		
		// calculate traction of all locomotives combined
		double zugkraft = 0;
		for ( Lokomotive lokomotive : lokomotive_set ) {
			zugkraft += lokomotive.getZugrakft();
		} 
		// compare maximum weight with traction
		if( zugkraft > maxgewicht ) {
			canPull = true;
		} else {
			System.out.println("Gesamte Zugkraft: " + zugkraft + ", Gesamtgewicht: " + maxgewicht);
		}
		return canPull;
	}
	
	

}
