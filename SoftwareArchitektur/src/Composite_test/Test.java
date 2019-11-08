package Composite_test;

public class Test {
	
	public static void main ( String[] args ) {
		
		// Mitarbeiter m1 = new Mitarbeiter("olli", 1234);  // abstract class can not be instatiated!
		Abteilungsleiter a1 = new Abteilungsleiter("Sigi", 11111, "Chefabteilung");
		Abteilungsleiter a11 = new Abteilungsleiter("Ollgu", 699128, "Zwugu-Abteilung");
		Abteilungsleiter a12 = new Abteilungsleiter("Lengu", 634473, "Lengu-Abteilung");
		
		// Mitarbeiter m1 = new Mitarbeiter("ma1", 256437437);  // why not working??
		Angestellter ang1 = new Angestellter("ma1", 256437437); 
		Angestellter ang2 = new Angestellter("ma2", 663437437); 
		Angestellter ang3 = new Angestellter("ma3", 256344637); 
		
		Angestellter ang4 = new Angestellter("ma4", 256344637); 
		Angestellter ang5 = new Angestellter("ma5", 256344637); 
		
		Angestellter ang0 = new Angestellter("ma0", 256344637); 



		a11.adMitarbeiter(ang2);
		a11.adMitarbeiter(ang1);
		a11.adMitarbeiter(ang3);
		
		a12.adMitarbeiter(ang4);
		a12.adMitarbeiter(ang5);
		
		a1.adMitarbeiter(ang0);
		a1.adMitarbeiter(a11);
		a1.adMitarbeiter(a12);
		
		String abt = a11.getAbteilung();
		System.out.println(abt);
		System.out.println();
		
		// getMitarbeiter not working ?!?
		System.out.println(a11.getMitarbeiter(0));
		System.out.println();
		
		// getMitarbeiter not working ?!?
		System.out.println(a12.getMitarbeiteranzahl());
		System.out.println();
		System.out.println(a11.getMitarbeiteranzahl());
		System.out.println();
		System.out.println(a1.getMitarbeiteranzahl());
		System.out.println();
		
		// showMitarbeiter
		//a11.showMitarbeiter("");
		a1.showMitarbeiter("");
	}

}
