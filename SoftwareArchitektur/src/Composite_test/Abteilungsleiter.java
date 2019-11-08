package Composite_test;

import java.util.ArrayList;


public class Abteilungsleiter extends Mitarbeiter {
	
	private String abteilung;
	private ArrayList<Mitarbeiter> liste = new ArrayList<Mitarbeiter>();
	
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
	
	
	/* Methods - static ??*/
	public void adMitarbeiter( Mitarbeiter mitarbeiter ) {
		liste.add(mitarbeiter);
	}
	public void rmMitarbeiter( Mitarbeiter mitarbeiter ) {
		liste.remove(mitarbeiter);
	}
	public Mitarbeiter getMitarbeiter( int idx ) {
		return liste.get(idx);
	}
	
	@Override
	public int getMitarbeiteranzahl() {
		int sum = 1;
		for (Mitarbeiter ma : liste) {
			sum += ma.getMitarbeiteranzahl();
		}
		return sum;
	}


	@Override
	public void showMitarbeiter(String abstand) {
		System.out.println(abstand + "Abteilungsleiter" + getName() + "("+getAbteilung()+" )" +  ", Tele.Nr.: " + getTelefon());
		for (Mitarbeiter ma : liste) {
			ma.showMitarbeiter(abstand + "    ");  // distance for employee
		}
	}
	
}
