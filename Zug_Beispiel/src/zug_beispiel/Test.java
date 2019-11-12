package zug_beispiel;


public class Test {
	
	public static void main ( String[] args ) {
		
		/* Builder or Factory for object creation ?!? */
	
		
		Lokomotive lok1 = new Lokomotive(45, 7, "typ_lok1982", "Boeing", 1982, "sn123", 5, 10, 500); 
		Lokomotive lok2 = new Lokomotive(53, 8, "typ_lok2000", "Airbus", 2000, "sn3246b", 7, 12, 700); 
		
		Wagon wag1 = new Wagon(17, 6, "typ_wag1974", "intel", 1974, "sn24intel", 50, 12);
		Wagon wag2 = new Wagon(11.1, 6.3, "typ_wag2012", "amd", 2012, "sn123amd", 62, 15);
		Wagon wag3 = new Wagon(9.9, 7.1, "typ_wag2010", "nvidia", 2010, "sn123nvidia", 57, 13);
		
		Zug zug1 = new Zug();
		Zug zug2 = new Zug();
		Zug zug3 = new Zug();

		zug1.addSchiennfahrzeug(lok1);
		zug1.addSchiennfahrzeug(lok2);
		zug1.addSchiennfahrzeug(wag1);
		zug1.addSchiennfahrzeug(wag2);
		
		zug2.addSchiennfahrzeug(lok2);
		zug2.addSchiennfahrzeug(wag3);
		
		zug3.addSchiennfahrzeug(zug1);
		zug3.addSchiennfahrzeug(zug2);

	
		System.out.println("");
		// test composite pattern
		System.out.println("Leergewicht: " + zug3.getLeergewicht());
		System.out.println("Maximalanzahl Passagiere: " + zug3.getPassagiere_max());
		System.out.println("Maximalanzahl ZuladungGueter: " + zug3.getZuladungsgewicht_max());
		System.out.println("Maximale gesamte Zuladung: " + zug3.getZuladung_max());
		System.out.println("Maximale Gesamtgewicht: " + zug3.getGewicht_max());
		System.out.println("Laenge: " + zug3.getLaenge());
		System.out.println("fahrfaehig: " + zug3.fahrfaehig());
		
		System.out.println("");
		zug3.printZug();
		
		zug3.delSchienenfahrzeug(zug1);
		System.out.println("");
		zug3.printZug();
		
	}


}
