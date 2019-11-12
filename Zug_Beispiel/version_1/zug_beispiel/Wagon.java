package zug_beispiel;

/** Class Wagon inherits from abstract class "Schienenfahrzeug"
 * 
 * 
 * 
 * @author Oliver Zott
 * @version 1.0
 */

public class Wagon extends Schienenfahrzeug{

	
	/* Constructor */
	public Wagon(double leergewicht, double laenge, String typenbezeichnung, String hersteller, int baujahr,
			String seriennummer, int passagiere, double zuladungsgewicht) {
		super(leergewicht, laenge, typenbezeichnung, hersteller, baujahr, seriennummer, passagiere, zuladungsgewicht);
	}


	
	
	
}
