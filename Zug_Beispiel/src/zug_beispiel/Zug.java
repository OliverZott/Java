package zug_beispiel;
import java.util.HashSet;


/** Class Zug 
 * 
 * Zug which consists of "Schienenfahrzeug" objects
 * Lokomotiven  1..*   
 * Wagon  0..* 
 * 
 * add builder function to: ensure 1..* lokomotive exists / if locomotives can pull  !!!
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



public class Zug extends Schienenfahrzeug {
	
	public static final String type = "Zug";

	// Constructor
	public Zug(Lokomotive lokomotive) {
		this.addSchiennfahrzeug(lokomotive);
	}
	
	
	/** 
	 * HashSet to store elements of type Lokomotive and Wagon or Zug (elements not sorted/ordered) 
	 */
	private HashSet<Schienenfahrzeug> liste = new HashSet<Schienenfahrzeug>();
	
	
	/**
	 * Methods to add / remove elements of train.
	 * Exceptions if train-element already in use or not part of train
	 * 
	 * Elements of train can be objects of classes:
	 * - "Wagon"
	 * - "Lokomotive"
	 * - "Zug" 
	 * 
	 * @param fahrzeug
	 */
	
	// function to check existence of Schienenfahrzeug in HashSet
	public void checkFahrzeug(Schienenfahrzeug fahrzeug) throws Exception {
		if (!liste.contains(fahrzeug)) {
			throw new Exception("Schienenfahrzeug '" + fahrzeug + "' nicht Teil des Zuges!");
		}
	}
	// function to check if Schienenfahrzeug already in use
	public void checkUse(Schienenfahrzeug fahrzeug) throws Exception {
		if(fahrzeug.isVerwendung()) {
			throw new Exception("Schienenfahrzeug '" + fahrzeug + "' bereits in Verwendung!");
		}
	}
	
	// add an element to train
	public void addSchiennfahrzeug(Schienenfahrzeug fahrzeug) {
		try {
			checkUse(fahrzeug);
			liste.add(fahrzeug);
			fahrzeug.setVerwendung(true);
		} catch (Exception e) {
			System.out.println("FEHLER: " + e);
		}
	}
	
	// remove an element of train
	public void delSchienenfahrzeug(Schienenfahrzeug fahrzeug) {
		try {
			checkFahrzeug(fahrzeug);
			liste.remove(fahrzeug);
			fahrzeug.setVerwendung(false);
		} catch (Exception e) {
			System.out.println("FEHLER: " + e);
		}
	}
	
	// method to print all elements of a train
	@Override
	public void printZug() {
		System.out.println("Fahrzeug: " + getTypenbezeichnung() + ", Typ: " + getType());
		for (Schienenfahrzeug fahrzeug : liste) {
			fahrzeug.printZug();
		}
	}
		
	
	/** 
	 * Methods to get information about the train 
	 * uses getter-methods of abstract base-class "Schienenfahrzeug"
	 */
	@Override
	public double getZugkraft() {
		double zugkraft = 0;
		for(Schienenfahrzeug fahrzeug : liste) {
			zugkraft += fahrzeug.getZugkraft();
		}
		return zugkraft;
	}
	@Override
	public String getType() {
		return type;
	}
	
	// empty weight of whole train
	public double getLeergewicht() {
		double leergewicht_total = 0;
		for (Schienenfahrzeug fahrzeug : liste) {
			leergewicht_total += fahrzeug.getLeergewicht();
		}
		return leergewicht_total;
	}
	
	// maximum amount of passengers 
	public int getPassagiere_max() {
		int passagiere_max = 0;
		for (Schienenfahrzeug fahrzeug : liste) {
			passagiere_max += fahrzeug.getPassagiere_max();
		}
		return passagiere_max;
	}
	
	// maximum amount of payload 
	public double getZuladungsgewicht_max() {
		int zuladung_max = 0;
		for (Schienenfahrzeug fahrzeug : liste) {
			zuladung_max += fahrzeug.getZuladungsgewicht_max();
		}
		return zuladung_max;
	}
	
	// maximum amount of payload including passengers (assumed 75kg weight each) 
	public double getZuladung_max() {
		return getZuladungsgewicht_max() + getPassagiere_max()*75;
	}
	
	// maximum weight overall
	public double getGewicht_max() {
		return getZuladung_max() + getLeergewicht();
	}
	
	// length of train 
	public double getLaenge() {
		double laenge = 0;
		for (Schienenfahrzeug fahrzeug : liste) {
			laenge += fahrzeug.getLaenge();
			// System.out.println(fahrzeug + ", " + fahrzeug.getLaenge());
		}
		return laenge;
	}

	// check if locomotives can pull the train
	public boolean fahrfaehig() {
		boolean canPull = false;
		double maxgewicht = getZuladung_max();
		// calculate traction of all locomotives combined
		double zugkraft = 0;
		for (Schienenfahrzeug fahrzeug : liste) {
			zugkraft += fahrzeug.getZugkraft();
		} 
		
		// compare maximum weight with traction
		if(zugkraft > maxgewicht) {
			canPull = true;
		} else {
			System.out.println("Gesamte Zugkraft: " + zugkraft + ", Gesamtgewicht: " + maxgewicht);
		}
		return canPull;
	}
	
	// check maximum amount of train guards
	public int getSchaffner_max() {
		int passagiere_max = getPassagiere_max();
		int countSchaffner = 0;
		if (passagiere_max > 50) {							// 1 "Schaffner" per 50 maximum passengers
			countSchaffner = (int) passagiere_max / 50;
		} else if (passagiere_max > 0){						// 1 "Schaffner" if > 1 maximum passenger
			countSchaffner = 1;
		}
		return countSchaffner;
		
	}
	

	
}
