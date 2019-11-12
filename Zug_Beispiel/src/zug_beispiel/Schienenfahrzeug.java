package zug_beispiel;

/** Abstract class generalizes classes "Wagon" and "Lokomotive"
 * 
 * Provides basic attributes, constructor, setters&getters
 * 
 * @author Oliver Zott
 * @version 1.1 
 */



public abstract class Schienenfahrzeug {
	
	/* Attributes (inherited by "Zug" and "Wagon"*/
	private double leergewicht;
	private double laenge;
	
	private String typenbezeichnung;
	private String hersteller;
	private int baujahr;  						// use date ???  short int ???
	private String seriennummer;				// UNIQUE ! ???
	
	private int passagiere_max;
	private double zuladungsgewicht_max;
	
	private boolean verwendung;  // used to ensure unique use 
	
	private String type = "";  // to differentiate between "Wagon" and "Lokomotive"
	
	
	
	/**
	 *  Constructors
	 *  
	 *  standard constructor for "Zug" child-class
	 *  explicit constructor for "Wagon" and "Lokomotive" child-classes
	 */
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


	
	/* Setter Getter methods */
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
	public String getType() {
		return type;
	}

	
	/** abstract method for "sort of" Composite-Pattern to make sure implementation 
	 * 
	 * Idea: 	a locomotive is a train
	 * 			a wagon is no train
	 * 			a wagon + a locomotive is a train
	 * 			a train composed by other trains is a train
	 * 
	 * Methods overridden in child-classes
	 * */
	
	public abstract double getZugkraft();
	public abstract void printZug();
	
}
