package Composite_test;

public class Angestellter extends Mitarbeiter{

	Angestellter( String name, int tele) {
		super(name, tele);
	}
	
	public int getMitarbeiteranzahl() {
		return  1;
	}
	
	@Override
	public void showMitarbeiter(String abstand) {
		System.out.println(abstand + getName() + ", Tele.Nr.: " + getTelefon());
	}

}
