package zug_beispiel;

/** Class Lokomotive inherits from abstract class "Schienenfahrzeug"
 * 
 * Additional attribute "zugkraft"
 * 
 * factory method ?! --> setType and getType overwritten by subclasses
 * 
 * @author Oliver Zott
 * @version 1.0
 */


public class Lokomotive extends Schienenfahrzeug{
	private double zugkraft;  			// weight to pull besides own wieght
	//private String typ;					// falls factory?!

	
	/* Constructor */
	public Lokomotive(double leergewicht, double laenge, String typenbezeichnung, String hersteller, int baujahr,
			String seriennummer, int passagiere, double zuladungsgewicht, double zugkraft) {
		super(leergewicht, laenge, typenbezeichnung, hersteller, baujahr, seriennummer, passagiere, zuladungsgewicht);
		this.zugkraft = zugkraft;
	}


	// Getter and Setter methods
	public double getZugrakft() {
		return zugkraft;
	}
	public void setZugrakft(double zugrakft) {
		this.zugkraft = zugrakft;
	}
	
	
}
