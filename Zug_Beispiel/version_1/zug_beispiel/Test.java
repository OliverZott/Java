package zug_beispiel;


public class Test {
	
	public static void main ( String[] args ) {
		
		/* Builder or Factory for object creation ?!? */
		
		
		Lokomotive lok1 = new Lokomotive(45, 7, "typ_lok1982", "Boeing", 1982, "sn123", 5, 10, 500); 
		Lokomotive lok2 = new Lokomotive(53, 8, "typ_lok2000", "Airbus", 2000, "sn3246b", 7, 12, 700); 
		
		Wagon wag1 = new Wagon(17, 6, "typ_wag1974", "intel", 1974, "sn24intel", 50, 12);
		Wagon wag2 = new Wagon(11.1, 6.3, "typ_wag2012", "amd", 2012, "sn123amd", 62, 15);
		
		Zug zug1 = new Zug();
		Zug zug2 = new Zug();
		
		zug1.addLokomotive(lok1);
		zug1.addLokomotive(lok2);
		zug1.addWagon(wag1);
		zug1.addWagon(wag2);
		
		zug2.addLokomotive(lok1);
		zug2.addWagon(wag1);
		
		System.out.println("Leergewicht: " + zug1.getLeergewicht());
		System.out.println("Maximalanzahl Passagiere: " + zug1.getMaxPassagiere());
		System.out.println("Maximalanzahl ZuladungGueter: " + zug1.getMaxZuladungGueter());
		System.out.println("Maximale gesamte Zuladung: " + zug1.getMaxZuladung());
		System.out.println("Maximale Gesamtgewicht: " + zug1.getMaxGewicht());
		System.out.println("Laenge: " + zug1.getLaenge());
		System.out.println("Ist der Zug fahrfaehig: " + zug1.fahrfaehig());
		
		
		System.out.println();
		zug1.delLokomotive(lok2);
		System.out.println(zug1.getLeergewicht());
		System.out.println(zug1.getMaxPassagiere());
		System.out.println(zug1.getMaxZuladungGueter());
		
		
	}


}
