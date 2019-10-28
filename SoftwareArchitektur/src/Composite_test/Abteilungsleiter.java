package Composite_test;

import java.util.ArrayList;


public class Abteilungsleiter extends Mitarbeiter {
	
	private String abteilung;
	private ArrayList<Mitarbeiter> Liste = new ArrayList<Mitarbeiter>();
	
	Abteilungsleiter(String name, int telefonNumber, String abteilung) {
		super(  name,  telefonNumber);
		this.abteilung = abteilung;
	}

	
	/* Setter and Getter */
	public void setAbteilung( String abteilung ) {
		this.abteilung = abteilung;
	}
	public String getAbteilung() {
		return abteilung;
	}
	
	
	/* Methods - static ???*/
	public void adMitarbeiter( Mitarbeiter mitarbeiter ) {
		Liste.add(mitarbeiter);
	}
	public void rmMitarbeiter( Mitarbeiter mitarbeiter ) {
		Liste.remove(mitarbeiter);
	}
	
	
}
