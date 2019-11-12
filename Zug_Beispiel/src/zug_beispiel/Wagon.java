package zug_beispiel;

/** Class Wagon inherits from abstract class "Schienenfahrzeug"
 * 
 * @author Oliver Zott
 * @version 1.1
 */

public class Wagon extends Schienenfahrzeug{

	public static final String type = "Wagon";
	
	/* Constructor */
	public Wagon(double leergewicht, double laenge, String typenbezeichnung, String hersteller, int baujahr,
			String seriennummer, int passagiere, double zuladungsgewicht) {
		super(leergewicht, laenge, typenbezeichnung, hersteller, baujahr, seriennummer, passagiere, zuladungsgewicht);
	}


	@Override
	public double getZugkraft() {
		return 0;
	};
	@Override
	public String getType() {
		return type;
	}
	
	public void printZug() {
		System.out.println("Fahrzeug: " + getTypenbezeichnung() + ", Typ: " + getType());
	}
	
}