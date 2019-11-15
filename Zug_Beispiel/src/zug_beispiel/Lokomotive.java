package zug_beispiel;

/** Class Lokomotive inherits from abstract class "Schienenfahrzeug"
 * 
 * Additional attribute "zugkraft"
 * factory method ?! --> setType and getType overwritten by subclasses
 * 
 * @author Oliver Zott
 * @version 1.1
 */



public class Lokomotive extends Schienenfahrzeug{
	
	public static final String type = "Lokomotive";

	private double zugkraft;  			// weight to pull besides own weight
		
	
	// Constructor 
	public Lokomotive(double leergewicht, double laenge, String typenbezeichnung, String hersteller, int baujahr,
			String seriennummer, int passagiere, double zuladungsgewicht, double zugkraft) {
		super(leergewicht, laenge, typenbezeichnung, hersteller, baujahr, seriennummer, passagiere, zuladungsgewicht);
		this.zugkraft = zugkraft;
	}

	
	// Getter and Setter methods
	public void setZugrakft(double zugrakft) {
		this.zugkraft = zugrakft;
	}
	
	
	// Methods 
	@Override
	public double getZugkraft() {
		return zugkraft + getLeergewicht();   // for calculation if train can be moved by locomotives
	};
	
	@Override
	public String getType() {
		return type;
	}

	public void printZug() {
		System.out.println("Fahrzeug: " + getTypenbezeichnung() + ", Typ: " + getType());
	}
	
}
