package zug_beispiel;


public class Demo {
	
	public static void main ( String[] args ) {
		
		// create elements of train
		Lokomotive lok1 = new Lokomotive(45, 7, "typ_lok1982", "Boeing", 1982, "sn123", 1, 10, 500); 
		Lokomotive lok2 = new Lokomotive(53, 8, "typ_lok2000", "Airbus", 2000, "sn3246b", 7, 12, 700);
		Lokomotive lok3 = new Lokomotive(48, 3, "typ_lok2016", "Lockheed", 2016, "sn1lo6b", 3, 11, 300);
		
		Wagon wag1 = new Wagon(17, 6, "typ_wag1974", "intel", 1974, "sn24intel", 50, 12);
		Wagon wag2 = new Wagon(11.1, 6.3, "typ_wag2012", "amd", 2012, "sn123amd", 62, 15);
		Wagon wag3 = new Wagon(9.9, 7.1, "typ_wag2010", "nvidia", 2010, "sn123nvidia", 57, 13);
		
		// create trains
		Zug zug1 = new Zug(lok1);
		Zug zug2 = new Zug(lok2);
		Zug zug3 = new Zug(lok3);
		
		// add elements to train
		zug1.addSchiennfahrzeug(wag1);
		zug1.addSchiennfahrzeug(wag2);
		zug2.addSchiennfahrzeug(wag3);
		zug3.addSchiennfahrzeug(zug1);
		zug3.addSchiennfahrzeug(zug2);

		// print trains
		zug1.printZug();
		System.out.println("");
		zug2.printZug();
		System.out.println("");
		zug3.printZug();
		System.out.println("");
		
		zug1.delSchienenfahrzeug(wag1);
		zug1.printZug();
		System.out.println("");
		

		// trying some implemented functions
		System.out.println("Leergewicht: " + zug3.getLeergewicht());
		System.out.println("Maximalanzahl Passagiere: " + zug3.getPassagiere_max());
		System.out.println("Maximalanzahl ZuladungGueter: " + zug3.getZuladungsgewicht_max());
		System.out.println("Maximale gesamte Zuladung: " + zug3.getZuladung_max());
		System.out.println("Maximale Gesamtgewicht: " + zug3.getGewicht_max());
		System.out.println("Laenge: " + zug3.getLaenge());
		System.out.println("fahrfaehig: " + zug3.fahrfaehig());
		System.out.println("Schaffner anzahl: " + zug3.getSchaffner_max());
		System.out.println("");

		// Example for exception handling
		zug3.delSchienenfahrzeug(wag1);

		
	}


}
