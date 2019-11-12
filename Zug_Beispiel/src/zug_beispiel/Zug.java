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
 * 	- HashSets to store "Wagon", "Lokomotive" and "Zug" objects
 * 	- Methods to add / remove "Wagon", "Lokomotive" and "Zug" objects
 * 	- Methods to get various information about the train
 *  - Method to check traction is enough
 * 
 * @author Oliver Zott
 * @version 1.1
 */

public class Zug extends Schienenfahrzeug{
	
	public static final String type = "Zug";

	// Constructor
	public Zug() {
	}
	
	
	/** 
	 * HashSet to store elements of type Lokomotive and Wagon or Zug (elements not sorted/ordered) 
	 */
	private HashSet<Schienenfahrzeug> liste = new HashSet<Schienenfahrzeug>();
	
	
	
	/**
	 * Methods to add / remove parts of train
	 * @param fahrzeug
	 */
	public void addSchiennfahrzeug(Schienenfahrzeug fahrzeug) {
		if ( !fahrzeug.isVerwendung()) {
			liste.add(fahrzeug);
			fahrzeug.setVerwendung(true);
		} else {
			System.out.println("Schienenfahrzeug '" + fahrzeug.getSeriennummer() + "' already in use." );
		}
	}
	
	public void delSchienenfahrzeug(Schienenfahrzeug fahrzeug) {
		liste.remove(fahrzeug);
		fahrzeug.setVerwendung(false);
	}
	
	
	/** 
	 * Methods to get information about the train 
	 * uses getter methods of abstract base-class
	 */
	@Override
	public double getZugkraft() {
		double zugkraft = 0;
		for(Schienenfahrzeug fahrzeug : liste) {
			zugkraft += fahrzeug.getZugkraft();
		}
		return zugkraft;
	}
	public String getType() {
		return type;
	}
	
	/* empty weight of whole train */
	public double getLeergewicht() {
		double leergewicht_total = 0;
		for ( Schienenfahrzeug fahrzeug : liste ) {
			leergewicht_total += fahrzeug.getLeergewicht();
		}
		return leergewicht_total;
	}
	
	/* maximum amount of passengers */
	public int getPassagiere_max() {
		int passagiere_max = 0;
		for ( Schienenfahrzeug fahrzeug : liste ) {
			passagiere_max += fahrzeug.getPassagiere_max();
		}
		return passagiere_max;
	}
	
	/* maximum amount of payload */
	public double getZuladungsgewicht_max() {
		int zuladung_max = 0;
		for ( Schienenfahrzeug fahrzeug : liste ) {
			zuladung_max += fahrzeug.getZuladungsgewicht_max();
		}
		return zuladung_max;
	}
	
	/* maximum amount of payload including passengers (assumed 75kg weight each) */
	public double getZuladung_max() {
		return getZuladungsgewicht_max() + getPassagiere_max()*75;
	}
	/* maximum weight overall */
	public double getGewicht_max() {
		return getZuladung_max() + getLeergewicht();
	}
	
	/* length of train */
	public double getLaenge() {
		double laenge = 0;
		for ( Schienenfahrzeug fahrzeug : liste ) {
			laenge += fahrzeug.getLaenge();
			// System.out.println(fahrzeug + ", " + fahrzeug.getLaenge());
		}
		return laenge;
	}

	
	/* check if locomotives can pull the train */
	public boolean fahrfaehig() {
		boolean canPull = false;
		double maxgewicht = getZuladung_max();
		// calculate traction of all locomotives combined
		double zugkraft = 0;
		for (Schienenfahrzeug fahrzeug : liste ) {
			zugkraft += fahrzeug.getZugkraft();
		} 
		
		// compare maximum weight with traction
		if( zugkraft > maxgewicht ) {
			canPull = true;
		} else {
			System.out.println("Gesamte Zugkraft: " + zugkraft + ", Gesamtgewicht: " + maxgewicht);
		}
		return canPull;
	}
	
	public void printZug() {
		System.out.println("Fahrzeug: " + getTypenbezeichnung() + ", Typ: " + getType());
		for (Schienenfahrzeug fahrzeug : liste ) {
			fahrzeug.printZug();
		}
	}
	

}
