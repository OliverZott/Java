package zug_beispiel;

/** Abstract class to generalize classes "Wagon" and "Lokomotive"
 * 
 * Provides basic attributes, constructor, setters&getters
 * 
 * @author Oliver Zott
 * @version 1.1 
 */



public abstract class Schienenfahrzeug {
	
	
	// Attributes
	private double leergewicht;
	private double laenge;
	private String typenbezeichnung;
	private String hersteller;
	private int baujahr;  						
	private String seriennummer;				// UNIQUE ! ???
	private int passagiere_max;
	private double zuladungsgewicht_max;
	private boolean verwendung;  // used to ensure unique use 
	
	
	// Constructors
	public Schienenfahrzeug() {
		
	}

	public Schienenfahrzeug(double leergewicht, double laenge, String typenbezeichnung, String hersteller, int baujahr,
			String seriennummer, int passagiere, double zuladungsgewicht) {
		super();
		this.leergewicht = leergewicht;
		this.laenge = laenge;
		this.typenbezeichnung = typenbezeichnung;
		this.hersteller = hersteller;
		this.baujahr = baujahr;
		this.seriennummer = seriennummer;
		this.passagiere_max = passagiere;
		this.zuladungsgewicht_max = zuladungsgewicht;
	}


	// Setter Getter methods 
	public double getLeergewicht() {
		return leergewicht;
	}
	public void setLeergewicht(double leergewicht) {
		this.leergewicht = leergewicht;
	}
	public double getLaenge() {
		return laenge;
	}
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}
	public String getTypenbezeichnung() {
		return typenbezeichnung;
	}
	public void setTypenbezeichnung(String typenbezeichnung) {
		this.typenbezeichnung = typenbezeichnung;
	}
	public String getHersteller() {
		return hersteller;
	}
	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
	public String getSeriennummer() {
		return seriennummer;
	}
	public void setSeriennummer(String seriennummer) {
		this.seriennummer = seriennummer;
	}
	public int getPassagiere_max() {
		return passagiere_max;
	}
	public void setPassagiere_max(int passagiere_max) {
		this.passagiere_max = passagiere_max;
	}
	public double getZuladungsgewicht_max() {
		return zuladungsgewicht_max;
	}
	public void setZuladungsgewicht_max(double zuladungsgewicht_max) {
		this.zuladungsgewicht_max = zuladungsgewicht_max;
	}
	public boolean isVerwendung() {
		return verwendung;
	}
	public void setVerwendung(boolean verwendung) {
		this.verwendung = verwendung;
	}

	
	/** abstract method to ensure implementation 
	 * Methods overridden in child-classes
	 * 
	 * Idea: 	a locomotive is a train
	 * 			a wagon is no train
	 * 			a wagon + a locomotive is a train
	 * 			a train composed by other trains is a train 
	 * */
	
	public abstract double getZugkraft();
	public abstract void printZug();
	public abstract String getType();
}

